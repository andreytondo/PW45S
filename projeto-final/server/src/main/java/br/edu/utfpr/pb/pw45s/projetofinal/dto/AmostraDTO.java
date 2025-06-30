package br.edu.utfpr.pb.pw45s.projetofinal.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AmostraDTO {
    private Long id;
    private AvaliacaoDTO avaliacao;
    private String nomeAmostra;
    private Integer numeroCamadas;
    private String arquivoUpload;
    private Float escoreQeVess;
    private String descricaoManejo;
    private String notaAmostra;
    private LocalDateTime dataAvaliacao;
    private Integer ordemAmostra;
    private String localizacao;
}
