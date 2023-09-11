package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha_hash")
    private String senhaHash;

    @Column(name = "senha_salt")
    private String senhaSalt;

    @Column(name = "red_senha")
    private String senha;

    @Column(name = "dat_env_cod")
    private String data;

    @OneToOne
    @JoinColumn(name = "id_pessoa_usuar")
    private Pessoa pessoa;
}
