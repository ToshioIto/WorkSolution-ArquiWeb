package upc.edu.pe.worksolutionapi.serviceimplements;

import upc.edu.pe.worksolutionapi.entities.Sede;
import upc.edu.pe.worksolutionapi.repositories.SedeRepository;
import upc.edu.pe.worksolutionapi.services.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeServiceImplement implements SedeService {

    @Autowired
    private SedeRepository sR;

    @Override
    public void insert(Sede sede) {
        sR.save(sede);
    }

    @Override
    public List<Sede> list() {
        return sR.findAll();
    }

    @Override
    public void delete(Long id) {
        sR.deleteById(id);
    }

    @Override
    public void update(Sede sede) {
        sR.save(sede);
    }
}
