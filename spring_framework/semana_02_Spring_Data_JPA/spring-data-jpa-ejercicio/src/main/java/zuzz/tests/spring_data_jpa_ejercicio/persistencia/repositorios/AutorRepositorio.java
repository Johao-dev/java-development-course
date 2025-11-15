package zuzz.tests.spring_data_jpa_ejercicio.persistencia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Autor;

@Repository
public interface AutorRepositorio extends ListCrudRepository<Autor, Long> {

    // listar todos los autores que contengan una letra
    @Query("SELECT a FROM Autor a WHERE a.nombre LIKE %:letra%")
    List<Autor> listarAutoresSegunLetra(@Param("letra") String letra);
}
