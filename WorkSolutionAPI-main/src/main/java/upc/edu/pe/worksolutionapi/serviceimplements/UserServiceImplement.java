package upc.edu.pe.worksolutionapi.serviceimplements;

import upc.edu.pe.worksolutionapi.entities.Users;
import upc.edu.pe.worksolutionapi.repositories.IUserRepository;
import upc.edu.pe.worksolutionapi.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Users usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public void update(Users users) {
        uR.save(users);
    }

    @Override
    public Optional<Users> findById(Long id) {
        return uR.findById(id);
    }
}
