package zuzz.learn.spring_framework.api_rest_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/saludos")
public class ApiRestDemoApplication {

	private Logger registradorDeEventos = LoggerFactory.getLogger(ApiRestDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiRestDemoApplication.class, args);
	}

	@GetMapping
	@RequestMapping("/saludo-principal")
	public String helloWorld() {
		registradorDeEventos.info("Nivel informativo");
		registradorDeEventos.warn("Nivel Advertencia");
		registradorDeEventos.debug("Nivel Debug");
		registradorDeEventos.trace("Nivel Traza/Seguimiento");
		registradorDeEventos.error("Nivel Error");
		return "Hola mundo desde Spring";
	}
}
