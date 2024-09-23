package upc.edu.pe.worksolutionapi.dtos;

import upc.edu.pe.worksolutionapi.entities.Especialidad;

import java.math.BigDecimal;

public class PrecioCitaDTO {
    private Long id;
    private Especialidad especialidad;
    private BigDecimal precio;

    // Getters y Setters
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
