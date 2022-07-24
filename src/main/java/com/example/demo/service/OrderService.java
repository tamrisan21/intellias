package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.model.Product;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order findById(Long id){
        return orderRepository.getOne(id);
    }

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public void deleteById(Long id){
        orderRepository.deleteById(id);
    }



}
