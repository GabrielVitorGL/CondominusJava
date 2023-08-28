package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Usuario_Sind")
public class UsuarioSindico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_sind")
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
    private String redefinirSenhaCod;
    @Column(name = "dat_env_cod")
    private LocalDate dataEnvioCod;
    @ManyToOne
    @JoinColumn(name = "id_Sindico_usuar")
    private Sindico sindico;
}
