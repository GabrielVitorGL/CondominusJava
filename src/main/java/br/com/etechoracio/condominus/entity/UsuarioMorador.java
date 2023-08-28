package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Usuario_mor")
public class UsuarioMorador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_mor")
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
    @JoinColumn(name = "id_Morador_usuar")
    private Morador morador;
}
