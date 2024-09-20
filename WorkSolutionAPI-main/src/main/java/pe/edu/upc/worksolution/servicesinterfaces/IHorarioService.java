package pe.edu.upc.worksolution.servicesinterfaces;

import pe.edu.upc.worksolution.entities.Horario;

import java.util.List;

public interface IHorarioService {
    void insert(Horario horario);

    List<Horario> list();
    void delete(Long id);
    void update(Horario horario);
}
