package br.edu.utfpr.pb.pw45s.projetofinal.model;

import br.edu.utfpr.pb.pw45s.projetofinal.shared.Identifiable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "camada")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Camada implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "amostra_id")
    private Amostra amostra;

    @Column(name = "numero_camada")
    private Integer numeroCamada;

    @Column(name = "comprimento_cm")
    private Float comprimentoCm;

    @Column(name = "nota_camada")
    private Integer notaCamada;

    @Column(name = "descricao_camada")
    private Float escoreCamada;
}
