package upc.edu.pe.worksolutionapi.serviceimplements;

import upc.edu.pe.worksolutionapi.entities.Especialidad;
import upc.edu.pe.worksolutionapi.repositories.EspecialidadRepository;
import upc.edu.pe.worksolutionapi.services.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadServiceImplement implements EspecialidadService {

    @Autowired
    private EspecialidadRepository eR;

    @Override
    public void insert(Especialidad especialidad) {
        eR.save(especialidad);
    }

    @Override
    public List<Especialidad> list() {
        return eR.findAll();
    }

    @Override
    public void delete(Long id) {
        eR.deleteById(id);
    }

    @Override
    public void update(Especialidad especialidad) {
        eR.save(especialidad);
    }
}
