package zuzz.tests.spring_data_jpa_ejercicio.controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Autor;
import zuzz.tests.spring_data_jpa_ejercicio.persistencia.repositorios.AutorRepositorio;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/autores")
public class AutorController {

    private final AutorRepositorio autorRepo;

    @GetMapping("/listar")
    public ResponseEntity<?> listarAutores() {
        List<Autor> autores = autorRepo.findAll();

        if (autores.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron autores.");
            // return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(autores);
    }
}
