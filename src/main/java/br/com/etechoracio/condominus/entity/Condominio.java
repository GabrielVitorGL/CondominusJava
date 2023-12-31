package br.com.etechoracio.condominus.entity;
import br.com.etechoracio.condominus.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

@Getter
@Setter
@Entity
@Table(name = "Condominio")
public class Condominio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_condominio")
    private Long id;

    @Column(name = "nome_condominio")
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    @Enumerated (EnumType.STRING)
    @Column (name = "status_")
    private StatusEnum status;
}
