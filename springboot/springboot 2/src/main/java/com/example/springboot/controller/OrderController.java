package com.example.springboot.controller;


import com.example.springboot.database.dao.OrderDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class OrderController {

    @Autowired
    private OrderDAO orderDAO;

    @GetMapping("/order/orderdetail")
    public ModelAndView orderDetail() {
        List<Map<String,Object>> orderDetails = orderDAO.getOrderDetails();
        ModelAndView response = new ModelAndView("order/orderdetail");
        response.addObject("orderDetails", orderDetails);
        return response;
    }
}
