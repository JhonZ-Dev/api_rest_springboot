package com.example.preacticaspring.modelos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_estados_viales")
@Data
@ToString
public class EstadoVial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estadoVial;
    private Boolean estado;
    private String temporada;
    private LocalDate fecha;

}
