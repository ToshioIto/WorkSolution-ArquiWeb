package upc.edu.pe.worksolutionapi.serviceimplements;

import upc.edu.pe.worksolutionapi.entities.Consultorio;
import upc.edu.pe.worksolutionapi.repositories.ConsultorioRepository;
import upc.edu.pe.worksolutionapi.services.ConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioServiceImplement implements ConsultorioService {

    @Autowired
    private ConsultorioRepository cR;

    @Override
    public void insert(Consultorio consultorio) {
        cR.save(consultorio);
    }

    @Override
    public List<Consultorio> list() {
        return cR.findAll();
    }

    @Override
    public void delete(Long id) {
        cR.deleteById(id);
    }

    @Override
    public void update(Consultorio consultorio) {
        cR.save(consultorio);
    }
}
