<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="include/header.jsp"></jsp:include>


<section style="background-color: aquamarine">
    <div class ="container">
        <div class ="row pt-5 pb-5">
        <h1>
           Search Page
        </h1>
        </div>
    </div>

</section>

<section style="background-color: white">
    <div class ="container">
        <div class ="row pt-5 pb-5">
            <h2 class ="text-center">
                Products found(${products.size()})
            </h2>
        </div>
    </div>
    <div class ="row pt-3">
        <div class ="col-12">
            <table>
            <tr>
                <th>id</th>
                <th>code</th>
                <th>name</th>
                <th>description</th>
            </tr>

            <c:forEach items ="${products}" var ="product">
                <tr>


                    <td> ${product.id}</td>
                    <td> ${product.productCode}</td>
                    <td> ${product.productName}</td>
                    <td> ${product.productDescription}</td>

                </tr>
                </table>

            </c:forEach>

        </div>

    </div>

</section>


<jsp:include page="include/footer.jsp"></jsp:include>