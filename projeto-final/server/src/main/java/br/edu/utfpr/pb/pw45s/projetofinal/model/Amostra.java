package br.edu.utfpr.pb.pw45s.projetofinal.model;

import br.edu.utfpr.pb.pw45s.projetofinal.shared.Identifiable;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity @Table(name = "amostra")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Amostra implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "avaliacao_id")
    private Avaliacao avaliacao;

    @Column(name = "nome_amostra")
    private String nomeAmostra;

    @Column(name = "numero_camadas")
    private Integer numeroCamadas;

    @Column(name = "arquivo_upload")
    private String arquivoUpload;

    @Column(name = "escore_qe_vess")
    private Float escoreQeVess;

    @Column(name = "descricao_manejo")
    private String descricaoManejo;

    @Column(name = "nota_amostra")
    private String notaAmostra;

    @Column(name = "data_avaliacao")
    private LocalDateTime dataAvaliacao;

    @Column(name = "ordem_amostra")
    private Integer ordemAmostra;

    private String localizacao;
}