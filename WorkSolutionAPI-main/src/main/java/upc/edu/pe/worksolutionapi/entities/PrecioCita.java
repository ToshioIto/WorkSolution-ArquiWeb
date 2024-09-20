package upc.edu.pe.worksolutionapi.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "precios_citas")
public class PrecioCita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad;

    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    public PrecioCita() {
    }

    public PrecioCita(Long id, Especialidad especialidad, BigDecimal precio) {
        this.id = id;
        this.especialidad = especialidad;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
