package upc.edu.pe.worksolutionapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.worksolutionapi.entities.Doctor;
import upc.edu.pe.worksolutionapi.repositories.IDoctorRepository;
import upc.edu.pe.worksolutionapi.services.IDoctorService;

import java.util.List;

@Service
public class DoctorServiceImplement implements IDoctorService {

    @Autowired
    private IDoctorRepository dR;
    @Override
    public void insert(Doctor doctor) {
        dR.save(doctor);
    }

    @Override
    public List<Doctor> list() {
        return dR.findAll();
    }

    @Override
    public void delete(Long id) {
        dR.deleteById(id);
    }

    @Override
    public void update(Doctor doctor) {
        dR.save(doctor);
    }
}
