package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Sede;

import java.util.List;

public interface SedeService {
    void insert(Sede sede);
    List<Sede> list();
    void delete(Long id);
    void update(Sede sede);
}
