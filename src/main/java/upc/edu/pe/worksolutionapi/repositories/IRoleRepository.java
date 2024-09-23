package upc.edu.pe.worksolutionapi.repositories;

import upc.edu.pe.worksolutionapi.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
}
