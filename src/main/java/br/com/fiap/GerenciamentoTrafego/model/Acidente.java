package br.com.fiap.GerenciamentoTrafego.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Acidente {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_ACIDENTES"
    )
    @SequenceGenerator(
            name = "SEQ_ACIDENTES",
            sequenceName = "SEQ_ACIDENTES",
            allocationSize = 1
    )
    @Column(name = "acidente_id")
    private Long acidenteId;
    private String descricao;
    private String severidade;
    private LocalDate dia;
    private String lugar;

}
