package upc.edu.pe.worksolutionapi.repositories;

import upc.edu.pe.worksolutionapi.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Users,Long> {
    public Users findByUsername(String username);
}
