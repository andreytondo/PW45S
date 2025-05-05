package com.github.andreytondo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

@RequestScoped
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    public void create(Pessoa pessoa) {
        repository.persist(pessoa);
    }

    @Transactional
    public void update(Long id, Pessoa pessoa) {
        Pessoa existing = repository.findById(id);
        if (existing == null) {
            throw new IllegalArgumentException("Pessoa not found with id: " + id);
        }
        existing.setNome(pessoa.getNome());
        existing.setCpf(pessoa.getCpf());
        existing.setTelefone(pessoa.getTelefone());
        existing.setRua(pessoa.getRua());
        existing.setNumero(pessoa.getNumero());
        existing.setComplemento(pessoa.getComplemento());
        existing.setBairro(pessoa.getBairro());
        existing.setCep(pessoa.getCep());
        existing.setCidade(pessoa.getCidade());
        existing.setEstado(pessoa.getEstado());
        repository.persist(existing);
    }

    @Transactional
    public void delete(Long id) {
        Pessoa pessoa = repository.findById(id);
        if (pessoa != null) {
            repository.delete(pessoa);
        }
    }


}
