package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.dto.AvaliacaoDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Avaliacao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.AvaliacaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.service.AvaliacaoService;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudController;
import org.simpleframework.xml.Path;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("avaliacao")
public class AvaliacaoController extends CrudController<Long, Avaliacao, AvaliacaoDTO, AvaliacaoRepository, AvaliacaoService> {

    public AvaliacaoController() {
        super(Avaliacao.class, AvaliacaoDTO.class);
    }

    @GetMapping("/all")
    public List<AvaliacaoDTO> findAll() {
        return service.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

}