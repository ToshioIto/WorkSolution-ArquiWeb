package upc.edu.pe.worksolutionapi.controllers;

import upc.edu.pe.worksolutionapi.dtos.PrecioCitaDTO;
import upc.edu.pe.worksolutionapi.entities.PrecioCita;
import upc.edu.pe.worksolutionapi.services.PrecioCitaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/precios")
public class PrecioCitaController {

    @Autowired
    private PrecioCitaService pS;

    @PostMapping
    public void registrar(@RequestBody PrecioCitaDTO dto) {
        ModelMapper m = new ModelMapper();
        PrecioCita precioCita = m.map(dto, PrecioCita.class);
        pS.insert(precioCita);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        pS.delete(id);
    }

    @GetMapping
    public List<PrecioCitaDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PrecioCitaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void actualizar(@RequestBody PrecioCitaDTO dto) {
        ModelMapper m = new ModelMapper();
        PrecioCita precioCita = m.map(dto, PrecioCita.class);
        pS.update(precioCita);
    }
}
