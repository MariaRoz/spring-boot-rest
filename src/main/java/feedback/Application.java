package feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages = {"feedback.controllers","feedback.services" } )
//@EntityScan("feedback.models")
//@EnableJpaRepositories("feedback.repositories")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
