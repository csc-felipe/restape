package nl.esciencecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "RestApe API", version = "0.0.1", description = "RESTfull API for the APE (Automated Pipeline Explorer) library."), servers = @Server(url = "http://localhost:4444", description = "Local server"))
public class RestapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapeApplication.class, args);
	}

	/*
	 * @Bean
	 * public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	 * return args -> {
	 * 
	 * System.out.println("Let's inspect the beans provided by Spring Boot:");
	 * 
	 * String[] beanNames = ctx.getBeanDefinitionNames();
	 * Arrays.sort(beanNames);
	 * for (String beanName : beanNames) {
	 * System.out.println(beanName);
	 * }
	 * 
	 * };
	 * }
	 */

}
