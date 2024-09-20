package pe.edu.upc.worksolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.worksolution.entities.Doctor;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Long> {
}
