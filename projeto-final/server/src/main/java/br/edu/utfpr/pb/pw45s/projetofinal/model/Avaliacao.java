package br.edu.utfpr.pb.pw45s.projetofinal.model;

import br.edu.utfpr.pb.pw45s.projetofinal.shared.Identifiable;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity @Table(name = "avaliacao")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Avaliacao implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "configuracao_id")
    private Configuracao configuracao;

    @Column(name = "nome_avaliacao")
    private String nomeAvaliacao;

    @Column(name = "data_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "data_fim")
    private LocalDateTime dataFim;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "resumo_avaliacao")
    private String resumoAvaliacao;

    @Column(name = "descricao_manejo_local")
    private String descricaoManejoLocal;

    @Column(name = "total_amostras")
    private Integer totalAmostras;

    @Column(name = "escore_medio_geral")
    private Float escoreMedioGeral;

    private String avaliador;
    private String informacoes;
    private String status;
}