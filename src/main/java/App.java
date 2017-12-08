import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App {

    @Bean
    public String getGreeting() {
        return "World.  How are you doing?";
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        String text = (String) context.getBean("getGreeting");
        System.out.println("Hello " + text);
    }
}
