package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Order;
import id.ac.ui.cs.advprog.eshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return null;
    }

    public Order updateStatus(String orderId, String status) {
        return null;
    }

    public Order findById(String orderId) {
        return null;
    }

    public List<Order> findAllByAuthor(String author) {
        return null;
    }
}