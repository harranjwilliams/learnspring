package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import data.repository.CustomerRepository;
import data.repository.InventoryItemRepository;
import data.repository.SalesOrderRepository;

@Configuration
public class DataConfig {
	
	@Bean
	public InventoryItemRepository inventoryItemRepository() {
		return new InventoryItemRepository();
	}
	
	@Bean
	public CustomerRepository customerRepository() {
		return new CustomerRepository();
	}
	
	@Bean
	public SalesOrderRepository salesOrderRepository() {
		return new SalesOrderRepository();
	}

}
