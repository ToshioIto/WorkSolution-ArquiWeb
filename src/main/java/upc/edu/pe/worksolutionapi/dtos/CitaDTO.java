package upc.edu.pe.worksolutionapi.dtos;

import upc.edu.pe.worksolutionapi.entities.Doctor;
import upc.edu.pe.worksolutionapi.entities.Consultorio;
import upc.edu.pe.worksolutionapi.entities.Especialidad;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaDTO {
    private Long id;
    private Doctor doctor;
    private Consultorio consultorio;
    private Especialidad especialidad;
    private LocalDate fecha;
    private LocalTime hora;


    public CitaDTO() {
    }

    public CitaDTO(Long id, Doctor doctor, Consultorio consultorio, Especialidad especialidad, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.doctor = doctor;
        this.consultorio = consultorio;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
