package zuzz.tests.spring_data_jpa_ejercicio.controladores.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CrearAutor {

    @NotBlank(message = "El nombre no debe ser nulo.")
    @Size(min = 8, max = 64, message = "El nombre debe tener una longitud de entre 8 a 64 caracteres.")
    private String nombre;
}
