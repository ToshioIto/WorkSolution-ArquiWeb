package upc.edu.pe.worksolutionapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.worksolutionapi.entities.Doctor;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Long> {
}
