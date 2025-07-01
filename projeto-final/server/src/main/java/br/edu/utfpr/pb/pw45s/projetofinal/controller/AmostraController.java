package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.dto.AmostraDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.dto.AvaliacaoDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Amostra;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Avaliacao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.AmostraRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.AvaliacaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.service.AmostraService;
import br.edu.utfpr.pb.pw45s.projetofinal.service.AvaliacaoService;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("amostra")
public class AmostraController extends CrudController<Long, Amostra, AmostraDTO, AmostraRepository, AmostraService> {

    public AmostraController() {
        super(Amostra.class, AmostraDTO.class);
    }

}