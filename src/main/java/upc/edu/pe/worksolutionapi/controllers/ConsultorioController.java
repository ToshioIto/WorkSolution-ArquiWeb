package upc.edu.pe.worksolutionapi.controllers;

import upc.edu.pe.worksolutionapi.dtos.ConsultorioDTO;
import upc.edu.pe.worksolutionapi.entities.Consultorio;
import upc.edu.pe.worksolutionapi.services.ConsultorioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/consultorios")
public class ConsultorioController {

    @Autowired
    private ConsultorioService cS;

    @PostMapping
    public void registrar(@RequestBody ConsultorioDTO dto) {
        ModelMapper m = new ModelMapper();
        Consultorio consultorio = m.map(dto, Consultorio.class);
        cS.insert(consultorio);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        cS.delete(id);
    }

    @GetMapping
    public List<ConsultorioDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ConsultorioDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void actualizar(@RequestBody ConsultorioDTO dto) {
        ModelMapper m = new ModelMapper();
        Consultorio consultorio = m.map(dto, Consultorio.class);
        cS.update(consultorio);
    }
}
