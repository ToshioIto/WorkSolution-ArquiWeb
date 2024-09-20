package pe.edu.upc.worksolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.worksolution.entities.Horario;

@Repository
public interface IHorarioRepository extends JpaRepository<Horario, Long> {
}
