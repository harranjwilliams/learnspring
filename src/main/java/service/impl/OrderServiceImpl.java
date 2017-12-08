package service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.repository.CustomerRepository;
import data.repository.SalesOrderRepository;
import domain.Customer;
import domain.Order;
import service.InventoryService;
import service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	private final InventoryService inventoryService;
	private final CustomerRepository customerRepository;
	private final SalesOrderRepository salesOrderRepository;
	
	@Autowired
	public OrderServiceImpl(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
		this.inventoryService = inventoryService;
		this.customerRepository = customerRepository;
		this.salesOrderRepository = salesOrderRepository;
	}
	
	public Order createOrder(Customer customer, Map<String, Long> items) {
		return null;
	}
	
	public Order createOrder(String customerId, Map<String, Long> items) {
		return null;
	}
	
	public Order getOrder(String orderId) {
		return null;
	}
}
