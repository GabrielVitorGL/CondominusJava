package br.com.etechoracio.condominus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    @ManyToOne
    @JoinColumn(name = "id_morador_reser")
    private Morador morador;
    @ManyToOne
    @JoinColumn(name = "id_areacomum_reser")
    private Reserva reserva;
}
