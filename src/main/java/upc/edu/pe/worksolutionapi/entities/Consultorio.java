package upc.edu.pe.worksolutionapi.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "consultorios")
public class Consultorio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", nullable = false)
    private int numero;

    @ManyToOne
    @JoinColumn(name = "sede_id")  // Fk a la entidad Sede
    private Sede sede;

    public Consultorio() {
    }

    public Consultorio(Long id, int numero, Sede sede) {
        this.id = id;
        this.numero = numero;
        this.sede = sede;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
