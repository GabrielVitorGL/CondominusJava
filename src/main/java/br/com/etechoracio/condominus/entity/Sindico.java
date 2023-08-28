package br.com.etechoracio.condominus.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

@Getter
@Setter
@Entity
@Table(name = "Sindico")
public class Sindico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sindico")
    private Long id;

    @Column(name = "cpf_sindico")
    private String cpf;

    @Column(name = "nome_sindico")
    private String nome;

    @Column(name = "telefone_sindico")
    private String telefone;

    @JoinColumn(name = "id_condominio_sind")
    @OneToOne
    private Condominio condominio;
}
