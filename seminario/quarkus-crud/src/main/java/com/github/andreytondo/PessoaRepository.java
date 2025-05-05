package com.github.andreytondo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class PessoaRepository implements PanacheRepository<Pessoa> {
}
