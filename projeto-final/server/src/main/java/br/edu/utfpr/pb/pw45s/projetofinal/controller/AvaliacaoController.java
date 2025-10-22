package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.dto.AvaliacaoDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Amostra;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Avaliacao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.AvaliacaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.service.AmostraService;
import br.edu.utfpr.pb.pw45s.projetofinal.service.AvaliacaoService;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("avaliacao")
public class AvaliacaoController extends CrudController<Long, Avaliacao, AvaliacaoDTO, AvaliacaoRepository, AvaliacaoService> {

    private final AmostraService amostraService;
    private final AvaliacaoService avaliacaoService;

    public AvaliacaoController(AmostraService amostraService, AvaliacaoService avaliacaoService) {
        super(Avaliacao.class, AvaliacaoDTO.class);

        this.amostraService = amostraService;
        this.avaliacaoService = avaliacaoService;
    }

    @GetMapping("/all")
    public List<AvaliacaoDTO> findAll() {
        return service.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}/completa")
    public ResponseEntity<Avaliacao> findAvaliacaoCompleta(@PathVariable Long id) {
        return service.findById(id)
                .map(avaliacao -> {
                    avaliacao.getAmostras().size();
                    return ResponseEntity.ok(avaliacao);
                })
                .orElse(ResponseEntity.notFound().build());
    }


}