package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.PrecioCita;

import java.util.List;

public interface PrecioCitaService {
    void insert(PrecioCita precioCita);
    List<PrecioCita> list();
    void delete(Long id);
    void update(PrecioCita precioCita);
}
