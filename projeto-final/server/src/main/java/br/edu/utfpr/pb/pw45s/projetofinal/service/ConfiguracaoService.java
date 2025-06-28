package br.edu.utfpr.pb.pw45s.projetofinal.service;

import br.edu.utfpr.pb.pw45s.projetofinal.model.Configuracao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.ConfiguracaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudService;
import org.springframework.stereotype.Service;

@Service
public class ConfiguracaoService extends CrudService<Long, Configuracao, ConfiguracaoRepository> {
}
