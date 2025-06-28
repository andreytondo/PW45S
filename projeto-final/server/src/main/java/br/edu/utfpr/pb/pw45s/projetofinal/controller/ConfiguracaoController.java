package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.dto.ConfiguracaoDTO;
import br.edu.utfpr.pb.pw45s.projetofinal.model.Configuracao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.ConfiguracaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.service.ConfiguracaoService;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("configuracao")
public class ConfiguracaoController extends CrudController<Long, Configuracao, ConfiguracaoDTO, ConfiguracaoRepository, ConfiguracaoService> {

    public ConfiguracaoController() {
        super(Configuracao.class, ConfiguracaoDTO.class);
    }

}