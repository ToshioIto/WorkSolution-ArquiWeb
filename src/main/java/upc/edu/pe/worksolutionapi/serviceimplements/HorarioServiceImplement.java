package upc.edu.pe.worksolutionapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.worksolutionapi.entities.Horario;
import upc.edu.pe.worksolutionapi.repositories.IHorarioRepository;
import upc.edu.pe.worksolutionapi.services.IHorarioService;

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
