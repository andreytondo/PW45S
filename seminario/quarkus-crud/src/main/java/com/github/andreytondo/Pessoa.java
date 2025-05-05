package com.github.andreytondo;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pessoa extends PanacheEntity {
    public String nome;
    public String cpf;
    public String telefone;
    public String rua;
    public String numero;
    public String complemento;
    public String bairro;
    public String cep;
    public String cidade;
    public String estado;

    public Long getId() {
        return this.id;
    }
}
