<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"></jsp:include>
<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <c:if test="${empty form.employeeId}">
                <h1 class="text-center">Create Customer</h1>
            </c:if>
            <c:if test="${not empty form.employeeId}">
                <h1 class="text-center">Edit Customer</h1>
            </c:if>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row pt-5">
            <div class="col-12">
                <form class="row g-3" action="/customer/submit" method="get">
                    <input type="hidden" name="customerId" value="${form.customerId}">
                    <div class="col-12">
                        <label for="customerName" class="form-label">Customer Name</label>
                        <input type="text" class="form-control" id="customerName" name="customerName" placeholder="Please input the company Name">
                    </div>
                    <div class="col-md-6">
                        <label for="contactFirstName" class="form-label">Contact First Name</label>
                        <input type="text" class="form-control" id="contactFirstName" name="contactFirstName">
                    </div>
                    <div class="col-md-6">
                        <label for="contactLastName" class="form-label">Contact Last Name</label>
                        <input type="text" class="form-control" id="contactLastName" name="contactLastName">
                    </div>
                    <div class="col-12">
                        <label for="addressLine1" class="form-label">Address</label>
                        <input type="text" class="form-control" id="addressLine1" name="addressLine1" placeholder="1234 Main St">
                    </div>
                    <div class="col-12">
                        <label for="addressLine2" class="form-label">Address 2</label>
                        <input type="text" class="form-control" id="addressLine2" name="addressLine2" placeholder="Apartment, studio, or floor">
                    </div>
                    <div class="col-md-4">
                        <label for="city" class="form-label">City</label>
                        <input type="text" class="form-control" id="city" name="city">
                    </div>
                    <div class="col-md-2">
                        <label for="state" class="form-label">State</label>
                        <input type="text" class="form-control" id="state" name="state">
                    </div>
                    <div class="col-md-3">
                        <label for="postalCode" class="form-label">Postal Code</label>
                        <input type="text" class="form-control" id="postalCode" name="postalCode">
                    </div>
                    <div class="col-md-3">
                        <label for="country" class="form-label">Country</label>
                        <input type="text" class="form-control" id="country" name="country">
                    </div>
                    <div class="col-md-6">
                        <label for="phone" class="form-label">Phone Number</label>
                        <input type="text" class="form-control" id="phone" name="phone">
                    </div>
                    <div class="col-md-4">
                        <label for="salesRep" class="form-label">Sales Rep</label>
                        <select id="salesRep" class="form-control" name="salesRep">
                            <c:forEach items="${employees}" var="employee">
                                <option value="${employee.id}">${employee.firstName} ${employee.lastName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col-md-2">
                        <label for="creditLimit" class="form-label">Credit Limit</label>
                        <input type="text" class="form-control" id="creditLimit" name="creditLimit">
                    </div>
                    <div class="col-12">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp"></jsp:include>
