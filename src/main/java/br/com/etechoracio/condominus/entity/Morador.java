package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Morador")
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_morador")
    private Long id;
    @Column(name = "nome_morador")
    private String nome;
    @Column(name = "cpf_morador")
    private String CPF;
    @Column(name = "telefone_morador")
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "id_apartamento_morad")
    private Apartamento apartamento;
}
