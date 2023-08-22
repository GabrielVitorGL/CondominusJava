package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Entrega")
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega")
    private Long id;
    @Column(name = "remetente")
    private String remetente;
    @Column(name = "data_entrega")
    private LocalDate dataEntrega;
    @Column(name = "data_retirada")
    private LocalDate dataRetirada;
    @ManyToOne
    @JoinColumn(name = "id_morador_entre")
    private Morador morador;
}
