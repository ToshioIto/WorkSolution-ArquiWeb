package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Doctor;

import java.util.List;

public interface IDoctorService {
    void insert(Doctor doctor);

    List<Doctor> list();
    void delete(Long id);
    void update(Doctor doctor);
}

