package com.example.springboot.controller;


import com.example.springboot.database.dao.ProductDAO;
import com.example.springboot.database.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller

public class IndexController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/")
    public ModelAndView index(@RequestParam(required = false) Integer id) {
        ModelAndView response = new ModelAndView("index");
        Product product = productDAO.findById(id);
        response.addObject("productKey", product);

        log.debug("Debug level");
        log.info("Info level");
        log.warn("Warning level");
        log.error("Error level");

        return response;
    }

    @GetMapping("/another-page")
    public ModelAndView anotherPage() {
        ModelAndView response = new ModelAndView("another-page");
        return response;
    }

    @GetMapping("/index/{id}")
    public ModelAndView indexPathVar(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("index");
        Product product = productDAO.findById(id);
        response.addObject("productKey", product);

        return response;
    }

    @GetMapping("/search")
    public ModelAndView search() {
        ModelAndView response = new ModelAndView("search");


        List<Product> products = productDAO.findAll();
        response.addObject("products", products);



        return response;
    }
}



