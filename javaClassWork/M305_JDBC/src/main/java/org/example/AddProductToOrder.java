package org.example;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

public class AddProductToOrder {

    // 1) Load an order from the database by id
    // 2) Load a product from the database by id
    // 3) Create a new OrderDetail object and add the order and the prodict
    // 4) Save the OrderDetail object to the database

    private OrderDAO orderDAO = new OrderDAO();
    private ProductDAO productDAO = new ProductDAO();
    private OrderDetailDAO orderDetailDAO = new OrderDetailDAO();

  
    public static void main(String[] args) {
        AddProductToOrder addProductToOrder = new AddProductToOrder();
        addProductToOrder.run();

    }

    private void run() {
        Order order = orderDAO.findById(10100);
        System.out.println(order);

        Customer customer = order.getCustomer();
        System.out.println();

        // if the product is already part of the order then increment the quantity ordered
        // 1) In your orderdetail dao .. create a findByProductIdAndOrderId method, also create insert and update methods
        // 2) instead of just createing a new order detail run your new query
        // 3) check if the order detail returned is null and if so create a new order detail
        // 4) check if the quantity orderd == null if so set to 1 otherwise increment by 1
        // 5) when saving ... check if the orderdetail.getid == null .. if so then it is an insert otherwise it is an update

        System.out.println("This order is for customer with an id = " + order.getCustomer().getId() + " and name = " + order.getCustomer().getCustomerName());
        System.out.println();
        System.out.println();
        System.out.println("This is order  for: "+ customer.getId() +"|||"+ customer.getCustomerName());
        System.out.println();

        for(OrderDetail od: order.getOrderDetails()) {
            System.out.println(od.getProduct().getProductName()+"|"+od.getQuantityOrdered()+ "|"+od.getPriceEach());
        }
        Product product = productDAO.findById(11);
        System.out.println(product);
        OrderDetail orderDetail = orderDetailDAO.findByOrderIdAndProductId(order.getId(), product.getId());
        if(orderDetail ==null){
           orderDetail = new OrderDetail();
        }

        if(orderDetail.getQuantityOrdered()==null){
            orderDetail.setQuantityOrdered(1);
        }else{
            orderDetail.setQuantityOrdered(orderDetail.getQuantityOrdered()+1);
        }

        orderDetail.setProduct(product);
        orderDetail.setOrder(order);
        orderDetail.setPriceEach(product.getMsrp());
        orderDetail.setOrderLineNumber(10);
        if(orderDetail.getId()==null){
            orderDetailDAO.insert(orderDetail);
        }
        else{
            orderDetailDAO.update(orderDetail);
        }




    }
}
