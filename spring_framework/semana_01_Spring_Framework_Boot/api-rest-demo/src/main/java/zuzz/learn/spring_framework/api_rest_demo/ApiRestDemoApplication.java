package zuzz.learn.spring_framework.api_rest_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/saludos")
public class ApiRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestDemoApplication.class, args);
	}

	@GetMapping
	@RequestMapping("/saludo-principal")
	public String helloWorld() {
		return "Hola mundo desde Spring";
	}
}
