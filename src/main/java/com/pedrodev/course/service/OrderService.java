package com.pedrodev.course.service;

import com.pedrodev.course.entities.Order;
import com.pedrodev.course.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll(){
        List<Order> list = orderRepository.findAll();
        return list;
    }

    public Optional<Order> findById(Long id){
        return orderRepository.findById(id);
    }
}
