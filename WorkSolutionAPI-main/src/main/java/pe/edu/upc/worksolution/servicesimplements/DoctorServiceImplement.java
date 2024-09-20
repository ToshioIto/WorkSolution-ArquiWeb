package pe.edu.upc.worksolution.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.worksolution.entities.Doctor;
import pe.edu.upc.worksolution.repositories.IDoctorRepository;
import pe.edu.upc.worksolution.servicesinterfaces.IDoctorService;

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
