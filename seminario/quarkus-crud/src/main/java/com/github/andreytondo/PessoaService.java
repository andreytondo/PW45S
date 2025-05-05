package com.github.andreytondo;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa findById(Long id) {
        return repository.findById(id);
    }
}
