package com.example.springboot.controller;

import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.dao.OfficeDAO;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Office;
import com.example.springboot.form.CreateEmployeeFormBean;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


import static org.hibernate.query.sqm.tree.SqmNode.log;

@Controller

@RequestMapping("/employee")

public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;
    @Autowired
    private OfficeDAO officeDAO;

    @GetMapping("/search")
    public ModelAndView employeeSearch(@RequestParam(required = false) String employeeSearch) {

        ModelAndView response = new ModelAndView("employee-search");

        response.addObject("employeeSearch", employeeSearch);
        List<Employee> employees = employeeDAO.findByLastName(employeeSearch);
        response.addObject("employees", employees);
        return response;
    }

    @GetMapping("/{id}")
    public ModelAndView indexPathVar(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("customer-list");
        Employee employee = employeeDAO.findById(id);
        response.addObject("employee", employee);

        return response;
    }

    private void loadDropDowns(ModelAndView response) {
        List<Employee> employees = employeeDAO.findAll();
        response.addObject("reportsToEmployees", employees);
        List<Office> offices = officeDAO.findAll();
        response.addObject("offices", offices);
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("create-employee");
//        List<Employee> employees = employeeDAO.findAll();
//        response.addObject("reportsToEmployees", employees);
//
//        List<Office> offices = officeDAO.findAll();
//        response.addObject("offices", offices);
        loadDropDowns(response);

        return response;
    }

    @GetMapping("/edit")
    public ModelAndView edit(@RequestParam(required = false) Integer id) {
        ModelAndView response = new ModelAndView("create-employee");
//        List<Employee> employees = employeeDAO.findAll();
//        response.addObject("reportsToEmployees", employees);
//
//        List<Office> offices = officeDAO.findAll();
//        response.addObject("offices", offices);
        loadDropDowns(response);

        if (id != null) {
            Employee employee = employeeDAO.findById(id);
            if (employee != null) {
                CreateEmployeeFormBean form = new CreateEmployeeFormBean();
                form.setEmployeeId(employee.getId());
                form.setEmail(employee.getEmail());
                form.setFirstName(employee.getFirstName());
                form.setLastName(employee.getLastName());
                form.setExtension(employee.getExtension());
                form.setJobTitle(employee.getJobTitle());
                form.setOfficeId(employee.getOffice().getId());
                form.setReportsTo(employee.getReportsTo());

                response.addObject("form", form);
            }
        }
        return response;
    }


    // this is /employee/createSubmit
    @PostMapping ("/createSubmit")
    public ModelAndView createSubmit(@Valid CreateEmployeeFormBean form, BindingResult bindingResult) {
        // argument to the constructor here is the view name - the view name can be a JSP location or a redirect URL
        ModelAndView response = new ModelAndView();
        if(form.getEmployeeId() == null ) {
            Employee employee = employeeDAO.findByEmailIgnoreCase(form.getEmail());
            if (employee != null) {
                bindingResult.rejectValue("email", "error.email.exists", "Email already exists");
            }
        }

        // the first thing we want to do is check if the incoming user input has any errors
        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.info("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }

            // we are in this part of the if statement so we know for sure that an error has occured
            // we are going to add the binding result to the model, so we can use it on the JSP page to show the user the errors
            response.addObject("bindingResult", bindingResult);

            // because the page needs the list of employees for the drop down we need to add the list of employees to the model
            loadDropDowns(response);

            // im going to set the view name to be
            response.setViewName("create-employee");

            // im going to add the form to the model so that we can display the user entered data in the form
            response.addObject("form", form);

            return response;
        } else {

            // log out the incoming variables that are in the CreateEmployeeFormBean
            // variable name
            log.info(form.toString());

            // setting the incoming user input onto a new Employee object to be saved to the database
            Employee employee = employeeDAO.findById(form.getEmployeeId());
            if (employee == null) {
                employee = new Employee();
            }

            employee.setEmail(form.getEmail());
            employee.setFirstName(form.getFirstName());
            employee.setLastName(form.getLastName());
            employee.setReportsTo(form.getReportsTo());
            employee.setExtension(form.getExtension());
            employee.setJobTitle(form.getJobTitle());

            Office office = officeDAO.findById(form.getOfficeId());
            // this wont work because its set to insertable = false and updateable = false
            //employee.setOfficeId(1);
            employee.setOffice(office);

            // when we save to the data base it will auto increment to give us a new id
            // the new ID is available in the return from the save method.
            // basically returns the same object .. after its been inserted into the database
            employee = employeeDAO.save(employee);

            // redirecting to the employee detail page
            // however often times this would redirect to the edit page (which we have not created)
            // after the redirect is actually a URL not a view name
            // in some ways this is overriding the behavior of the setViewName to use a URL rather than a JSP file location
//            response.setViewName("redirect:/employee/" + employee.getId());

            loadDropDowns(response);
            response.setViewName("create-employee");

            return response;
        }
    }


}
