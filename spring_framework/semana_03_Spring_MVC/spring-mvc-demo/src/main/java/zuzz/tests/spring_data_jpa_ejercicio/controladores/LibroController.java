package zuzz.tests.spring_data_jpa_ejercicio.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import zuzz.tests.spring_data_jpa_ejercicio.controladores.dtos.CrearLibro;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Libro;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.repositorios.LibroRepositorio;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/libros")
public class LibroController {

    private final LibroRepositorio libroRepo;

    @GetMapping
    public ResponseEntity<?> listarLibros() {
        List<Libro> librolistar = libroRepo.findAll();

        if (librolistar.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron libros");
            // return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(librolistar);
    }

    @GetMapping("/listar-por-anio")
    public ResponseEntity<?> listarLibrosPorAnio(@RequestParam("anio") Integer anio) {
        List<Libro> libros = libroRepo.listarLibrosPorAnio(anio);

        if (libros.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron libros para el año: " + anio);
        }

        return ResponseEntity.ok().body(libros);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<HttpStatus> eliminarLibro(@PathVariable("id") Long id) {

        try {
            libroRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<?> crearLibro(@Valid @RequestBody CrearLibro crearLibroDto) {
        try {
            Libro nuevoLibro = new Libro();
            nuevoLibro.setId(null);
            nuevoLibro.setTitulo(crearLibroDto.getTitulo());
            nuevoLibro.setAnioPublicacion(crearLibroDto.getAnioPublicacion());
            nuevoLibro.setAutor(crearLibroDto.getAutor()); // hm

            libroRepo.save(nuevoLibro);

            return ResponseEntity.status(201).body("Nuevo libro creado");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
