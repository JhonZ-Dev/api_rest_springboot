package com.example.preacticaspring.servicios;

import com.example.preacticaspring.modelos.EstadoVial;
import com.example.preacticaspring.repositorios.EstadoVialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoVialService {
  

    //listar
    public List<EstadoVial> listar(){
        return repo.findAll();
    }

    //encontrarPorID
    //OPTIONAL, CLASE
    Optional<EstadoVial> encontrarPorId(Long id_estadoVial){
        return repo
                .findById(id_estadoVial);
    }

    //eliminar
    public void eliminar(Long id_estadoVial){
        repo.deleteById(id_estadoVial);
    }



}
