package pe.edu.upc.worksolution.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.worksolution.dtos.HorarioDTO;
import pe.edu.upc.worksolution.entities.Horario;
import pe.edu.upc.worksolution.servicesinterfaces.IHorarioService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/horarios")
public class HorarioController {

    @Autowired
    private IHorarioService hS;

    @PostMapping
    public void registrar(@RequestBody HorarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Horario horario = m.map(dto, Horario.class);
        hS.insert(horario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        hS.delete(id);
    }

    @GetMapping
    public List<HorarioDTO> listar() {
        return hS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, HorarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void actualizar(@RequestBody HorarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Horario horario = m.map(dto, Horario.class);
        hS.update(horario);
    }
}
