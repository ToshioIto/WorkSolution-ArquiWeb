package pe.edu.upc.worksolution.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.worksolution.entities.Horario;
import pe.edu.upc.worksolution.repositories.IHorarioRepository;
import pe.edu.upc.worksolution.servicesinterfaces.IHorarioService;

import java.util.List;

@Service
public class HorarioServiceImplement implements IHorarioService {

    @Autowired
    private IHorarioRepository hR;
    @Override
    public void insert(Horario horario) {
        hR.save(horario);
    }

    @Override
    public List<Horario> list() {
        return hR.findAll();
    }

    @Override
    public void delete(Long id) {
        hR.deleteById(id);
    }

    @Override
    public void update(Horario horario) {
        hR.save(horario);
    }
}
