package com.backfranco.demo.controller;

import com.backfranco.demo.models.Experiencia;
import com.backfranco.demo.services.ExperienciaService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "https://argentinaprogramayoprogramo.web.app")
@RequestMapping("/experiencia")

public class ExperienciaController {

    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }


    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        Experiencia updateExperiencia = experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        List<Experiencia> experiencias = experienciaService.buscarExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        Experiencia nuevaExperiencia = experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}