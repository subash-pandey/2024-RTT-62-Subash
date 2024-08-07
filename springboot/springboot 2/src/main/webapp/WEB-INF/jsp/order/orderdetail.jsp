<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"></jsp:include>
<section style="background-color: white">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h2 class="text-center">Customers found (${orderDetails.size()})</h2>
        </div>
    </div>
    <div class="row pt-3">
        <div class="col-12">
            <table class="table table-bordered">
                <tr>
                    <th>Order Id</th>
                    <th>Order Date</th>
                    <th>Product Name</th>
                    <th>Quantity Ordered</th>
                    <th>Price Each</th>
                    <th>Line Item Total</th>
                </tr>
                <c:forEach items="${orderDetails}" var="detail">
                    <tr>
                        <td>${detail.order_id}</td>
                        <td>${detail.order_date}</td>
                        <td>${detail.product_name}</td>
                        <td>${detail.quantity_ordered}</td>
                        <td>${detail.price_each}</td>
                        <td>${detail.line_item_total}</td>

                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp"></jsp:include>