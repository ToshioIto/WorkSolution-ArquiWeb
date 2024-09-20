package pe.edu.upc.worksolution.servicesinterfaces;

import pe.edu.upc.worksolution.entities.Doctor;

import java.util.List;

public interface IDoctorService {
    void insert(Doctor doctor);

    List<Doctor> list();
    void delete(Long id);
    void update(Doctor doctor);
}

