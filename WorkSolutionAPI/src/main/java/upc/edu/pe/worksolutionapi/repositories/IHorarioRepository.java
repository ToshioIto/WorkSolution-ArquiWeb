package upc.edu.pe.worksolutionapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.worksolutionapi.entities.Horario;

@Repository
public interface IHorarioRepository extends JpaRepository<Horario, Long> {
}
