package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Horario;

import java.util.List;

public interface IHorarioService {
    void insert(Horario horario);

    List<Horario> list();
    void delete(Long id);
    void update(Horario horario);
}
