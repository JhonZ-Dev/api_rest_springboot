package com.example.preacticaspring.controller;

import com.example.preacticaspring.modelos.EstadoVial;
import com.example.preacticaspring.servicios.EstadoVialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EstadoVialController {
    @Autowired
    public EstadoVialService service;

    @PostMapping("/enviar")
    public EstadoVial guardar(@RequestBody EstadoVial estadoVial){
        return service.guardar(estadoVial);
    }

    @GetMapping("/obtener")
    public List<EstadoVial> listar(){
        return service.listar();
    }

    @DeleteMapping("/editar/{id_estadoVial}")
    public void eliminar(@RequestParam Long id_estadoVial){
        service.eliminar(id_estadoVial);
    }
}
