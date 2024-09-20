package upc.edu.pe.worksolutionapi.controllers;

import upc.edu.pe.worksolutionapi.dtos.CitaDTO;
import upc.edu.pe.worksolutionapi.entities.Cita;
import upc.edu.pe.worksolutionapi.services.CitaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService cS;

    @PostMapping
    public void registrar(@RequestBody CitaDTO dto) {
        ModelMapper m = new ModelMapper();
        Cita cita = m.map(dto, Cita.class);
        cS.insert(cita);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        cS.delete(id);
    }

    @GetMapping
    public List<CitaDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void actualizar(@RequestBody CitaDTO dto) {
        ModelMapper m = new ModelMapper();
        Cita cita = m.map(dto, Cita.class);
        cS.update(cita);
    }
}

