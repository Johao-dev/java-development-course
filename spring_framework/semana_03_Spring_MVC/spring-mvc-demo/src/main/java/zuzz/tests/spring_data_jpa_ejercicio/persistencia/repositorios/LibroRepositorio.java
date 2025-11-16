package zuzz.tests.spring_data_jpa_ejercicio.persistencia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Libro;

@Repository
public interface LibroRepositorio extends ListCrudRepository<Libro, Long> {

    // listar todos los libros dado un año de publicacion

    // la propiedad 'name' nos da el acceso para escribir con la sintaxis de JPQL.
    @Query("SELECT l FROM Libro l WHERE l.anioPublicacion = :anio")
    List<Libro> listarLibrosPorAnio(@Param("anio") Integer anio);



    // la propiedad 'nativeQuery' indica si la consulta estara escrita con SQL o con JPQL.
    // @Query(value = "SELECT * FROM libros WHERE anio_publicacion = :anio", nativeQuery = true)
}
