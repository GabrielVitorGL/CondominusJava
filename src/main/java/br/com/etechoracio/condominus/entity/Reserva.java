package br.com.etechoracio.condominus.entity;

import br.com.etechoracio.condominus.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.geom.Area;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id;

    @Column(name = "data_reserva")
    private LocalDate dataEntrega;

    @Column(name ="status_")
    private StatusEnum status;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_reser")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_areacomum_reser")
    private AreaComum areaComum;
}
