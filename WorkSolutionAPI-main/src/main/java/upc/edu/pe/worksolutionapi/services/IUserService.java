package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Users;

import java.util.List;

import java.util.Optional;

public interface IUserService {
    void insert(Users usuario);
    List<Users> list();
    void delete(Long id);
    void update(Users users);

    // Nuevo método para buscar por ID
    Optional<Users> findById(Long id);
}
