package upc.edu.pe.worksolutionapi.serviceimplements;

import upc.edu.pe.worksolutionapi.entities.Role;
import upc.edu.pe.worksolutionapi.repositories.IRoleRepository;
import upc.edu.pe.worksolutionapi.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role rol) {
        rR.save(rol);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        rR.deleteById(idRol);
    }
}