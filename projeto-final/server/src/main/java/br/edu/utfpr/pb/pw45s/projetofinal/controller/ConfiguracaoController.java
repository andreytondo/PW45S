package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.dto.ConfiguracaoDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Configuracao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.ConfiguracaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.service.ConfiguracaoService;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("configuracao")
public class ConfiguracaoController extends CrudController<Long, Configuracao, ConfiguracaoDTO, ConfiguracaoRepository, ConfiguracaoService> {

    public ConfiguracaoController() {
        super(Configuracao.class, ConfiguracaoDTO.class);
    }
    @GetMapping
    public List<ConfiguracaoDTO> findAll() {
        return service.findAll()
                .stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ConfiguracaoDTO> findById(@PathVariable Long id) {
        List<Configuracao> configs = service.findAll();
        if (!configs.isEmpty()) return ResponseEntity.ok(toDto(configs.getFirst()));
        return null;
    }
}