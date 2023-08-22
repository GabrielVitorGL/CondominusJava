package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Apartamento")
public class Apartamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_apartamento")
    private Long id;
    @Column(name = "telefone_apartamento")
    private String telefone;
    @Column(name = "numero")
    private String numero;
    @ManyToOne
    @JoinColumn(name = "id_condominio_apart")
    private Condominio condominio;
}
