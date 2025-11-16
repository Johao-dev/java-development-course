package zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 64)
    private String nombre;

    // relaciones en la aplicacion

    @OneToMany(
        targetEntity = Libro.class,
        fetch = FetchType.EAGER,
        mappedBy = "autor"
    )
    @JsonManagedReference
    private List<Libro> libros;
}
