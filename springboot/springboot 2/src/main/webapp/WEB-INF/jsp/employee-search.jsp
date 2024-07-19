<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<jsp:include page="include/header.jsp"></jsp:include>
<section class ="container">
    <div class ="row pt-5 pb-5">
        <h1>
            Search Page
        </h1>
    </div>

    <div class="container">
        <div class="row justify-content-center pt-5 pb-3">
            <div class="col-8 text-center">
                <form action ="/employee/search">
                    <div class="mb-3">
                        <label for="search" class="form-label"><h4>Employee Search</h4></label>
                        <input type="text" value ="${employeeSearch}" class="form-control" id="search" name="employeeSearch" placeholder="Enter employee's first or last name ">
                    </div>
                    <button type="submit" class="btn btn-primary">Search</button>
                </form>
            </div>
        </div>
    </div>


</section>

<section>

</section>

<section style="background-color: white">
<div class ="container">
    <div class ="row pt-5 pb-5">
        <h2 class ="text-center">
            Employees found(${employees.size()})
        </h2>
    </div>
</div>
<div class ="row pt-3">
    <div class ="col-12">
        <table class ="table">
            <tr>
                <th>id</th>
                <th>Last Name</th>
                <th>First Name</th>
                <th>Office Id</th>
                <th>Costumer List</th>
                <th>Edit Information</th>


            </tr>

            <c:forEach items ="${employees}" var ="employee">
                <tr>


                    <td> ${employee.id}</td>
                    <td> ${employee.lastName}</td>
                    <td> ${employee.firstName}</td>
                    <td> ${employee.officeId}</td>
                    <td><a href="http://localhost:8080/employee/${employee.id}"> Details</a></td>
                    <td><a href="http://localhost:8080/employee/edit?id=${employee.id}"> Edit</a></td>

                </tr>


            </c:forEach>
        </table>

    </div>

</div>

</section>


<jsp:include page="include/footer.jsp"></jsp:include>