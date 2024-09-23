package upc.edu.pe.worksolutionapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.worksolutionapi.dtos.DoctorDTO;
import upc.edu.pe.worksolutionapi.entities.Doctor;
import upc.edu.pe.worksolutionapi.services.IDoctorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/doctores")
public class DoctorController {

    @Autowired
    private IDoctorService dS;

    @PostMapping
    public void registrar(@RequestBody DoctorDTO dto) {
        ModelMapper m = new ModelMapper();
        Doctor doctor = m.map(dto, Doctor.class);
        dS.insert(doctor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        dS.delete(id);
    }

    @GetMapping
    public List<DoctorDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DoctorDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void actualizar(@RequestBody DoctorDTO dto) {
        ModelMapper m = new ModelMapper();
        Doctor doctor = m.map(dto, Doctor.class);
        dS.update(doctor);
    }
}
