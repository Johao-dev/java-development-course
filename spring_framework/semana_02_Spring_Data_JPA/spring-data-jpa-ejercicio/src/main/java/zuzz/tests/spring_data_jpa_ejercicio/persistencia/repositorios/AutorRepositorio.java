package zuzz.tests.spring_data_jpa_ejercicio.persistencia.repositorios;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades.Autor;

@Repository
public interface AutorRepositorio extends ListCrudRepository<Autor, Long> {

}
