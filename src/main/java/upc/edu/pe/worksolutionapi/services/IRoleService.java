package upc.edu.pe.worksolutionapi.services;

import upc.edu.pe.worksolutionapi.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Long idRol);

}
