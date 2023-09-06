package br.com.etechoracio.condominus.entity;

import br.com.etechoracio.condominus.enums.PerfilEnum;
import br.com.etechoracio.condominus.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Long id;

    @Column (name = "Cpf")
    private String cpf;

    @Column (name = "Telefone")
    private String telefone;

    @Column (name = "Perfil")
    private PerfilEnum perfil;

    @Column (name = "Status")
    private StatusEnum status;

    @ManyToMany
    @JoinTable (name = "")
    private Condominio condominio;

    @ManyToMany
    @JoinColumn (name = "")
    private Apartamento apartamento;
}
