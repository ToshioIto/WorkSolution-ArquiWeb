package upc.edu.pe.worksolutionapi.controllers;

import upc.edu.pe.worksolutionapi.dtos.UserDTO;
import upc.edu.pe.worksolutionapi.entities.Users;
import upc.edu.pe.worksolutionapi.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder; // Se asegura que se use BCrypt
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private IUserService uS;

    @Autowired
    private PasswordEncoder passwordEncoder; // Inyección de BCryptPasswordEncoder

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        uS.delete(id);
    }

    @GetMapping
    public List<UserDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users users = m.map(dto, Users.class);
        // Aquí se encripta la contraseña antes de guardarla
        String encodedPassword = passwordEncoder.encode(users.getPassword());
        users.setPassword(encodedPassword);
        uS.insert(users);
    }

    @PutMapping
    public void actualizar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users users = m.map(dto, Users.class);
        // También se encripta la nueva contraseña si se está actualizando
        String encodedPassword = passwordEncoder.encode(users.getPassword());
        users.setPassword(encodedPassword);
        uS.update(users);
    }
}
