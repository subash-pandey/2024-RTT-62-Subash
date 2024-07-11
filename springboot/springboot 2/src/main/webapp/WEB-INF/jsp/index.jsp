<jsp:include page="header.jsp"></jsp:include>
<h1>
    Index page!!!!!
</h1>

<table class="table">
    <tr><td>id</td><td>${productKey.id}</td></tr>
    <tr><td>code</td><td>${productKey.productCode}</td></tr>
    <tr><td>name</td><td>${productKey.productName}</td></tr>
    <tr><td>description</td><td>${productKey.productDescription}</td></tr>
</table>
<jsp:include page="footer.jsp"></jsp:include>