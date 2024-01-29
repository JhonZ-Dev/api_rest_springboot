package com.example.preacticaspring.repositorios;


import com.example.preacticaspring.modelos.EstadoVial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EstadoVialRepo extends JpaRepository<EstadoVial, Long> {



}
