package upc.edu.pe.worksolutionapi.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "doctores")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "numeroColegiatura", nullable = false, length = 10)
    private String numeroColegiatura;
    @Column(name = "correo", nullable = false, length = 40)
    private String correo;
    @Column(name = "celular", nullable = false)
    private int celular;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    @JsonManagedReference  // Marca este lado como el dueño de la relación
    private List<Horario> horarios;

    public Doctor() {
    }

    public Doctor(Long id, String nombre, String numeroColegiatura, String correo, int celular, List<Horario> horarios) {
        this.id = id;
        this.nombre = nombre;
        this.numeroColegiatura = numeroColegiatura;
        this.correo = correo;
        this.celular = celular;
        this.horarios = horarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(String numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
}