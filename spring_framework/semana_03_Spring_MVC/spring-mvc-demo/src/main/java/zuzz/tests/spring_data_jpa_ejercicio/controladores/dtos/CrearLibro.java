package zuzz.tests.spring_data_jpa_ejercicio.controladores.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Autor;

@Data
@RequiredArgsConstructor
public class CrearLibro {

    @NotBlank(message = "El titulo no debe ser nulo, estar vacio o contener espacios en blanco.")
    @Size(min = 10, max = 128, message = "El titulo debe tener una longitud de entre 10 a 128 caracteres.")
    private final String titulo;

    @NotNull(message = "El año de publicacion no debe ser nulo.")
    @Positive(message = "El año de publicacion debe ser positivo.")
    @Max(value = 9999, message = "El año no debe exceder de 9999.")
    private final Integer anioPublicacion;

    @Setter
    @Getter
    // @Null
    private Autor autor;
}
