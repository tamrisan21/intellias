package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.service.OrderService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String findAll(Model model){
        List<Order> orders = orderService.findAll();
        model.addAttribute("orders", orders);
        return "order-list";
    }

    @GetMapping("/order-create")
    public String createOrderForm(Order order){
        return "order-create";
    }

    @PostMapping("/order-create")
    public String createOrder(Order order){
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("order-delete/{id}")
    public String deleteOrder(@PathVariable("id") Long id){
        orderService.deleteById(id);
        return "redirect:/orders";
    }

    @GetMapping("/order-update/{id}")
    public String updateOrderForm(@PathVariable("id") Long id, Model model){
        Order order = orderService.findById(id);
        model.addAttribute("order", order);
        return "order-update";
    }

    @PostMapping("/order-update")
    public String updateOrder(Order order){
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

}
