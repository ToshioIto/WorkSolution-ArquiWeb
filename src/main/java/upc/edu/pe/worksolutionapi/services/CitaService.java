package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Cita;

import java.util.List;

public interface CitaService {
    void insert(Cita cita);
    List<Cita> list();
    void delete(Long id);
    void update(Cita cita);
}

