package java_course.spring.api_rest_libros.persistencia.repositorio;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java_course.spring.api_rest_libros.persistencia.entidad.Libro;

// con esta anotacion Spring reconocera esta clase como un bean y la gestionara en su contendor de dependencias
@Repository
public interface LibroRepositorio extends ListCrudRepository<Libro, Long> {

    /*
     * Existen mas interfaces que Spring Data JPA nos oferece de manera automatica
     * ListCrudRepository solo es una de ellas;  lo que hace es darnos todos los metodos CRUD:
     * 
     * - Agregar
     * - Editar
     * - Eliminar
     * - Consultar uno
     * - Consultar todos
     * 
     * De manera automatica sin que nosotros tengamos que hacerlo. Ademas los metodos
     * que devuelven una lista de entidades las devuelve usando la interfaz List<>.
     */
}
