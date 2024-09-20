package upc.edu.pe.worksolutionapi.controllers;

import upc.edu.pe.worksolutionapi.dtos.SedeDTO;
import upc.edu.pe.worksolutionapi.entities.Sede;
import upc.edu.pe.worksolutionapi.services.SedeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sedes")
public class SedeController {

    @Autowired
    private SedeService sS;

    @PostMapping
    public void registrar(@RequestBody SedeDTO dto) {
        ModelMapper m = new ModelMapper();
        Sede sede = m.map(dto, Sede.class);
        sS.insert(sede);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        sS.delete(id);
    }

    @GetMapping
    public List<SedeDTO> listar() {
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SedeDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void actualizar(@RequestBody SedeDTO dto) {
        ModelMapper m = new ModelMapper();
        Sede sede = m.map(dto, Sede.class);
        sS.update(sede);
    }
}
