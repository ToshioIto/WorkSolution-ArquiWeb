package upc.edu.pe.worksolutionapi.serviceimplements;

import upc.edu.pe.worksolutionapi.entities.PrecioCita;
import upc.edu.pe.worksolutionapi.repositories.PrecioCitaRepository;
import upc.edu.pe.worksolutionapi.services.PrecioCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioCitaServiceImplement implements PrecioCitaService {

    @Autowired
    private PrecioCitaRepository pR;

    @Override
    public void insert(PrecioCita precioCita) {
        pR.save(precioCita);
    }

    @Override
    public List<PrecioCita> list() {
        return pR.findAll();
    }

    @Override
    public void delete(Long id) {
        pR.deleteById(id);
    }

    @Override
    public void update(PrecioCita precioCita) {
        pR.save(precioCita);
    }
}
