package br.com.fiap.GerenciamentoTrafego.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Semaforo {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_SEMAFOROS"
    )
    @SequenceGenerator(
            name = "SEQ_SEMAFOROS",
            sequenceName = "SEQ_SEMAFOROS",
            allocationSize = 1
    )
    @Column(name = "semaforo_id")
    private Long semaforoId;
    private String estado;
    private int duracao;
    private String lugar;
    private boolean funcionando;

}
