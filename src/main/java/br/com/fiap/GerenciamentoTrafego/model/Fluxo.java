package br.com.fiap.GerenciamentoTrafego.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Fluxo {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_FLUXOS"
    )
    @SequenceGenerator(
            name = "SEQ_FLUXOS",
            sequenceName = "SEQ_FLUXOS",
            allocationSize = 1
    )
    @Column(name = "fluxo_id")
    private Long fluxoId;

    @Column(name = "qtd_veiculos")
    private int quantidadeVeiculos;

    @Column(name = "v_media")
    private double velocidadeMedia;

}
