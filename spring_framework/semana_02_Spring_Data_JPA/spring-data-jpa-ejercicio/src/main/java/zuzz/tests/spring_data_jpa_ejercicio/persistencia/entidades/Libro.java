package zuzz.tests.spring_data_jpa_ejercicio.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "libro_id")
    private Long id;

    // 'titulo' VARCHAR(64) NOT NULL
    @Column(name = "titulo", nullable = false, length = 64)
    private String titulo;

    @Column(name = "anio_publicacion", nullable = true)
    private Integer anioPublicacion;

    @ManyToOne(targetEntity = Autor.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id", nullable = false, referencedColumnName = "autor_id")
    private Autor autor;
}
