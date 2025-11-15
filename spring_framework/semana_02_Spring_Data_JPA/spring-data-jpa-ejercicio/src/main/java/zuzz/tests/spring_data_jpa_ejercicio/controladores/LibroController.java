package zuzz.tests.spring_data_jpa_ejercicio.controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Libro;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.repositorios.LibroRepositorio;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroRepositorio libroRepo;

    @GetMapping("/listar-por-anio")
    public ResponseEntity<?> listarLibrosPorAnio(@RequestParam("anio") Integer anio) {
        List<Libro> libros = libroRepo.listarLibrosPorAnio(anio);

        if (libros.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron libros para el año: " + anio);
        }

        return ResponseEntity.ok().body(libros);
    }
}
