package br.edu.utfpr.pb.pw45s.projetofinal.service;

import br.edu.utfpr.pb.pw45s.projetofinal.model.Avaliacao;
import br.edu.utfpr.pb.pw45s.projetofinal.repository.AvaliacaoRepository;
import br.edu.utfpr.pb.pw45s.projetofinal.shared.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService extends CrudService<Long, Avaliacao, AvaliacaoRepository> {

    public List<Avaliacao> findAll() {
        return repository.findAll();
    }
}
