package upc.edu.pe.worksolutionapi.repositories;

import upc.edu.pe.worksolutionapi.entities.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {
}
