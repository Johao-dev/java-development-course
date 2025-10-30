package java_course.spring.api_rest_libros.controladores;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java_course.spring.api_rest_libros.persistencia.entidad.Libro;
import java_course.spring.api_rest_libros.persistencia.repositorio.LibroRepositorio;

/*
 * Esta clase sera la que deben configurar.
 * Tiene que tener endpoints para:
 * 
 * - Agregar un nuevo libro
 * - Editar un libro existente
 * - Eliminar un libro por ID
 * - Buscar un libro por su ID
 * - Recuperar todos los libros
 * 
 */
@RestController
@RequestMapping("/api/libros")
public class LibroControlador {

    // La clase LibroControlador tiene una dependencia.
    private final LibroRepositorio repositorio;

    /*
     * ¿Como recibe la clase su dependencia?
     * 
     * La recibira por constructor (inyeccion de dependencia).
     * 
     * ¿Quien le pasara la dependencia?
     * 
     * Nosotros no. Spring con su contenedor de dependencia lo hara por nosotros.
     */
    public LibroControlador(LibroRepositorio repo) {
        this.repositorio = repo;
    }

    /**
     * Endpoint: /api/libros/{id}
     * Busca un libro por su ID
     * 
     * @param id El ID a buscar.
     * @return El libro encontrado. 404 (Not Found) Si no.
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Libro> libroOptional = repositorio.findById(id);
        return libroOptional.isPresent() ?
            ResponseEntity.ok(libroOptional.get()) :
            ResponseEntity.status(404).body("No se encontro el libro solicitado.");
    }
}
