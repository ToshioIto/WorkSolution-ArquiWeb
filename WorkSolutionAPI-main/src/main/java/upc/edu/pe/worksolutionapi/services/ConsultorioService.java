package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Consultorio;

import java.util.List;

public interface ConsultorioService {
    void insert(Consultorio consultorio);
    List<Consultorio> list();
    void delete(Long id);
    void update(Consultorio consultorio);
}
