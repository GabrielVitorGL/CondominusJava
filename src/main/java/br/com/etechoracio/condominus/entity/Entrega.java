package br.com.etechoracio.condominus.entity;

import br.com.etechoracio.condominus.enums.StatusEnum;
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

    @Column(name = "status_")
    private StatusEnum status;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_entre")
    private Pessoa pessoa;
}
