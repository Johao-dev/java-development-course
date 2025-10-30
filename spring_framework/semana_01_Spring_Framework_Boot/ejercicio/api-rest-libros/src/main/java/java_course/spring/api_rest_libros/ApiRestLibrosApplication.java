package java_course.spring.api_rest_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Aqui realmente no deberia ir ningun tipo de codigo mas que de configuracion.
 * La vez que inicimos el controlador desde aqui solo fue para mostrar el funcionamiento.
 */

@SpringBootApplication
public class ApiRestLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestLibrosApplication.class, args);
	}
}
