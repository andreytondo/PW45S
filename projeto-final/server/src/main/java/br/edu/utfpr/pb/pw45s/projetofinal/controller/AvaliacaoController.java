package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.dto.AvaliacaoDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Avaliacao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.AvaliacaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.service.AvaliacaoService;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avaliacao")
public class AvaliacaoController extends CrudController<Long, Avaliacao, AvaliacaoDTO, AvaliacaoRepository, AvaliacaoService> {

    public AvaliacaoController() {
        super(Avaliacao.class, AvaliacaoDTO.class);
    }

}