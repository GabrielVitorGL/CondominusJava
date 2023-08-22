package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Sindico")
public class Sindico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sindico")
    private Long id;
    @Column(name = "nome_sindico")
    private String nome;
    @Column(name = "cpf_sindico")
    private String CPF;
    @Column(name = "telefone_sindico")
    private String telefone;
}
