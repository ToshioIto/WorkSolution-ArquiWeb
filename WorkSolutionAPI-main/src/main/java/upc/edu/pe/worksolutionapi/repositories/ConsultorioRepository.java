package upc.edu.pe.worksolutionapi.repositories;

import upc.edu.pe.worksolutionapi.entities.Consultorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {
}
