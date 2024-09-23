package upc.edu.pe.worksolutionapi.controllers;

import upc.edu.pe.worksolutionapi.dtos.EspecialidadDTO;
import upc.edu.pe.worksolutionapi.entities.Especialidad;
import upc.edu.pe.worksolutionapi.services.EspecialidadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

    @Autowired
    private EspecialidadService eS;

    @PostMapping
    public void registrar(@RequestBody EspecialidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Especialidad especialidad = m.map(dto, Especialidad.class);
        eS.insert(especialidad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        eS.delete(id);
    }

    @GetMapping
    public List<EspecialidadDTO> listar() {
        return eS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EspecialidadDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public void actualizar(@RequestBody EspecialidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Especialidad especialidad = m.map(dto, Especialidad.class);
        eS.update(especialidad);
    }
}
