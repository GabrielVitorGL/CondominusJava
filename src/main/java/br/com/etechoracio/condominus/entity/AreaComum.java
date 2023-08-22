package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "AreaComum")
public class AreaComum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_areacomum")
    private Long id;
    @Column(name = "nome_areacomum")
    private LocalDate dataEntrega;
    @Column(name = "capacidade")
    private int capacidade;
}
