package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import config.AppConfig.Worker;
import data.repository.CustomerRepository;
import data.repository.InventoryItemRepository;
import data.repository.SalesOrderRepository;
import service.InventoryService;
import service.OrderService;
import service.impl.InventoryServiceImpl;
import service.impl.OrderServiceImpl;

/*
@Configuration
@Import(DataConfig.class)
@PropertySource("classpath:/application-${spring.profiles.active}.properties")
*/
public class AppConfigFirst {

	/*
	@Value("${greeting.text}")
	private String greetingText;
	
	@Value("${greeting.preamble}")
	private String greetingPreamble;
	
	@Value("#{new Boolean(environment['spring.profiles.active']=='dev')}")
	private boolean isDev;
	
	public class Worker {
		private String preamble;
		private String text;
		
		public Worker(String preamble, String text) {
			this.preamble = preamble;
			this.text = text;
		}
		
		public void execute() {
			System.out.println(preamble + " " + text + " is dev: " + isDev);
		}
	}
	*/
	
	/*
	@Bean
	@Profile("dev")
	public Worker workerForDev() {
		return new Worker("Hello", greetingText);
	}
	
	@Bean
	@Profile("prod")
	public Worker workerForProd() {
		return new Worker("Greetings", greetingText);
	}
	*/
	
	/*
	@Bean
	@Scope("prototype") // Default is singleton. Session and request are both Web related scopes
	public Worker worker() {
		return new Worker(greetingPreamble, greetingText);
	}
	*/
	
	/*
	
	@Autowired
	private InventoryItemRepository inventoryItemRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private SalesOrderRepository salesOrderRepository;
	*/
	
	/*
	@Bean
	public OrderService orderService(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
		return new OrderServiceImpl(inventoryService, customerRepository, salesOrderRepository);
	}
	
	@Bean
	public InventoryService inventoryService(InventoryItemRepository inventoryItemRepository) {
		return new InventoryServiceImpl(inventoryItemRepository);
	}
	*/
	
	public static void main (String args[]) {
		/*
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigFirst.class);
		OrderService orderService = context.getBean(OrderService.class);
		System.out.println(orderService == null ? "NULL" : "A Ok with refactored code!");
		Worker worker = context.getBean(Worker.class);
		worker.execute();
		*/
	}
}
