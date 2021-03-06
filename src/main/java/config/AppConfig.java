package config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import service.OrderService;

@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan
public class AppConfig {
	
	@Value("${greeting.text}")
	private String greetingText;
	
	@Value("${greeting.preamble}")
	private String greetingPreamble;
	
	public class Worker {
		private String preamble;
		private String text;
		
		public Worker(String preamble, String text) {
			this.preamble = preamble;
			this.text = text;
			System.out.println("New Instance");
		}
		
		public void execute() {
			System.out.println(preamble + " " + text);
		}
	}
	
	@Bean
	public Worker worker() {
		return new Worker(greetingPreamble, greetingText);
	}
	
	public static void main (String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Worker worker = context.getBean(Worker.class);
		worker.execute();
		OrderService orderService = context.getBean(OrderService.class);
	}

}
