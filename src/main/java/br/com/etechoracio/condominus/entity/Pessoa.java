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
    @Column (name = "id_pessoa")
    private Long id;

    @Column (name = "nome_pessoa")
    private String nome;

    @Column (name = "cpf_pessoa")
    private String cpf;

    @Column (name = "perfil_pessoa")
    private String perfil;

    @Column (name = "telefone_pessoa")
    private String telefone;

    @Column (name = "status_pessoa")
    private PerfilEnum perfilEnum;

    @ManyToOne
    @JoinTable (name = "id_condominio")
    private Condominio condominio;

    @ManyToMany
    @JoinTable(name = "pessoa_apartamento", joinColumns = @JoinColumn(name = "id_pessoa_rela"),
            inverseJoinColumns = @JoinColumn (name = "id_apartamento_rela"))
    private Apartamento apartamento;
}
