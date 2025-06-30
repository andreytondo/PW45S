package br.edu.utfpr.pb.pw45s.projetofinal.dto;

import lombok.Data;

@Data
public class CamadaDTO {
    private Long id;
    private AmostraDTO amostra;
    private Integer numeroCamada;
    private Float comprimentoCm;
    private Integer notaCamada;
    private Float escoreCamada;
}
