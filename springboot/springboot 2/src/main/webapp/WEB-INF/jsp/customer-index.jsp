<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="include/header.jsp"></jsp:include>

<h1>
    Customer Detail Page
</h1>



<table class="table table-striped">
    <tr>
        <td>Id</td>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <td>Sales Rep Id</td>
        <td>${customer.salesRepEmployeeId}</td>
    </tr>
    <tr>
        <td>Customer Name</td>
        <td>${customer.customerName}</td>
    </tr>
    <tr>
        <td>Contact First Name</td>
        <td>${customer.contactFirstName}</td>
    </tr>
    <tr>
        <td>Contact Last Name</td>
        <td>${customer.contactLastName}</td>
    </tr>
</table>

<jsp:include page="include/footer.jsp"></jsp:include>
