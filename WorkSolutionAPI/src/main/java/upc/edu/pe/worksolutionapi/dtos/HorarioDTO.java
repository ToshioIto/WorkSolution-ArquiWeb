package upc.edu.pe.worksolutionapi.dtos;

import java.time.LocalTime;

public class HorarioDTO {
    private Long id;
    private String turno;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private DoctorDTO doctor;

    public HorarioDTO() {
    }

    public HorarioDTO(Long id, String turno, LocalTime horaInicio, LocalTime horaFin, DoctorDTO doctor) {
        this.id = id;
        this.turno = turno;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.doctor = doctor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public DoctorDTO getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorDTO doctor) {
        this.doctor = doctor;
    }
}