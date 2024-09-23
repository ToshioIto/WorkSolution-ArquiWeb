package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Especialidad;

import java.util.List;

public interface EspecialidadService {
    void insert(Especialidad especialidad);
    List<Especialidad> list();
    void delete(Long id);
    void update(Especialidad especialidad);
}

