<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="include/header.jsp"></jsp:include>
<section class="container">
    <div class="row pt-5 pb-5">
        <h1 class="text-center">Customer Page List for employee  ${employee.id} </h1>
    </div>
    <table class="table">
        <tr><td>id</td><td>${employee.id}</td></tr>
        <tr><td>First Name</td><td>${employee.firstName}</td></tr>
       <tr><td>LastName</td><td>${employee.lastName}</td></tr>
       <tr><td>Position</td><td>${employee.jobTitle}</td></tr>
    </table>

</section>

<section style="background-color: white">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h2 class="text-center">Customers found (${customers.size()})</h2>
        </div>
    </div>
    <div class="row pt-3">
        <div class="col-12">
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Customer Rep Id</th>
                    <th>Customer Name</th>
                    <th>Contact First Name</th>
                    <th>Contact Last Name</th>
                    <th>Order List</th>
                </tr>
                <c:forEach items="${customers}" var="customer">
                    <tr>
                        <td><a href ="/customer/index/${customer.id}">${customer.id}</a></td>
                        <td>${customer.salesRepEmployeeId}</td>
                        <td>${customer.customerName}</td>
                        <td>${customer.contactFirstName}</td>
                        <td>${customer.contactLastName}</td>
                        <td><a href="#">Order Details</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</section>