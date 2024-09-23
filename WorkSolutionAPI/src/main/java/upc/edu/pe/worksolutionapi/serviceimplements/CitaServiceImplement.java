package upc.edu.pe.worksolutionapi.serviceimplements;

import upc.edu.pe.worksolutionapi.entities.Cita;
import upc.edu.pe.worksolutionapi.repositories.CitaRepository;
import upc.edu.pe.worksolutionapi.services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImplement implements CitaService {

    @Autowired
    private CitaRepository cR;

    @Override
    public void insert(Cita cita) {
        cR.save(cita);
    }

    @Override
    public List<Cita> list() {
        return cR.findAll();
    }

    @Override
    public void delete(Long id) {
        cR.deleteById(id);
    }

    @Override
    public void update(Cita cita) {
        cR.save(cita);
    }
}

