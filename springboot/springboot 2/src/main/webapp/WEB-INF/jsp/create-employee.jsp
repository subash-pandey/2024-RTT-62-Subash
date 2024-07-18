<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="include/header.jsp"></jsp:include>
<!-- a page header -->
<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Create Employee</h1>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row pt-5">
            <div class="col-12">
                <form action="/employee/createSubmit">
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="emailId" class="col-form-label">Email</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="emailId" name="email" class="form-control
<c:if test ="${bindingResult.hasFieldErrors('email')}">id-invalid</c:if>"
                                   value="${form.email}">
                        </div>
                    </div>
                    <c:if test ="${bindingResult.hasFieldErrors('email')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>

                    </c:if>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="firstNameId" class="col-form-label">First Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="firstNameId" name="firstName" class="form-control" value="${form.firstName}">
                        </div>
                    </div>

                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="lastNameId" class="col-form-label">Last Name</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="lastNameId" name="lastName" class="form-control
                           <c:if test ="${bindingResult.hasFieldErrors('lastName')}">id-invalid</c:if>" value="${form.lastName}">
                        </div>
                    </div>
                    <c:if test ="${bindingResult.hasFieldErrors('lastName')}">
                    <div class="row align-items-center justify-content-center">
                        <div class="offset-2 col-4">
                            <div class="text-danger">
                                <c:forEach items="${bindingResult.getFieldErrors('lastName')}" var="lastName">
                                    ${lastName.defaultMessage}<br>
                                </c:forEach>
                            </div>
                        </div>
                    </div>

                    </c:if>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="jobTitle" class="col-form-label">Job Title</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="jobTitle" name="jobTitle" class="form-control">
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="extension" class="col-form-label">Extension</label>
                        </div>
                        <div class="col-auto">
                            <input type="text" id="extension" name="extension" class="form-control">
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="reportsTo" class="col-form-label">Reports To</label>
                        </div>
                        <div class="col-4">
                            <select id="reportsTo" name="reportsTo" class="form-control">
                                <c:forEach items="${reportsToEmployees}" var="employee">
                                    <option value="${employee.id}"
                                            <c:if test ="${employee.id== form.reportsTo}">selected</c:if>
                                    >${employee.firstName} ${employee.lastName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row align-items-center justify-content-center pb-3">
                        <div class="col-2">
                            <label for="office" class="col-form-label">Office</label>
                        </div>
                        <div class="col-4">
                            <select id="office" name="officeId" class="form-control">
                                <c:forEach items="${offices}" var="office">
                                    <option value="${office.id}"
                                            <c:if test="${office.id == form.officeId}">selected</c:if>
                                    >${office.city}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="col-auto text-center">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="include/footer.jsp"></jsp:include>
