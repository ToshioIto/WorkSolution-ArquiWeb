package upc.edu.pe.worksolutionapi.dtos;

import upc.edu.pe.worksolutionapi.entities.Sede;

public class ConsultorioDTO {
    private Long id;
    private int numero;
    private Sede sede;

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
