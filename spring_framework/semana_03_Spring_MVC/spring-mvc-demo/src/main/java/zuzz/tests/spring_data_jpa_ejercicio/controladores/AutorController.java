package zuzz.tests.spring_data_jpa_ejercicio.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import zuzz.tests.spring_data_jpa_ejercicio.controladores.dtos.CrearAutor;
import zuzz.tests.spring_data_jpa_ejercicio.controladores.excepciones.AutorNoEncontradoException;
import zuzz.tests.spring_data_jpa_ejercicio.controladores.excepciones.AutorNoValidoException;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Autor;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.repositorios.AutorRepositorio;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/autores")
public class AutorController {

    private final AutorRepositorio autorRepo;

    @GetMapping
    public ResponseEntity<?> listarAutores() {
        List<Autor> autores = autorRepo.findAll();

        if (autores.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron autores.");
            // return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(autores);
    }

    @GetMapping("/{autorId}")
    public ResponseEntity<?> getAutorById(@PathVariable Long autorId) {
        Optional<Autor> autor = autorRepo.findById(autorId);

        if (!autor.isPresent()) {
            throw new AutorNoEncontradoException("No se encontro el autor con ID: " + autorId);
        }

        return ResponseEntity.ok(autor);
    }
    

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Autor> actualizarAutor(@PathVariable("id") Long id, @RequestBody Autor detallesAutor) {
        Optional<Autor> autorExiste = autorRepo.findById(id);
        if (autorExiste.isPresent()) {
            Autor autorActualizar = autorExiste.get();
            autorActualizar.setNombre(detallesAutor.getNombre());
            Autor autorGuardado = autorRepo.save(autorActualizar);
            return ResponseEntity.ok(autorGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<HttpStatus> eliminarAutor(@PathVariable("id") Long id) {

        try {
            autorRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<?> crearAutor(@Valid @RequestBody CrearAutor autorDto) {
        if (autorDto == null) {
            throw new AutorNoValidoException("El autor no debe ser nulo.");
        }

        Autor nuevoAutor = new Autor();
        nuevoAutor.setId(null);
        nuevoAutor.setNombre(autorDto.getNombre());

        autorRepo.save(nuevoAutor);
        return ResponseEntity.status(201).body("Nuevo autor creado");
    }
}
