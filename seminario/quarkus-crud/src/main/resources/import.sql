drop table if exists pessoa;

create table if not exists pessoa (
    id serial primary key,
    nome varchar(255),
    cpf varchar(11),
    telefone varchar(11),
    rua varchar(255),
    numero varchar(10),
    complemento varchar(255),
    bairro varchar(255),
    cep varchar(8),
    cidade varchar(255),
    estado varchar(2)
);

insert into pessoa (nome, cpf, telefone, rua, numero, complemento, bairro, cep, cidade, estado) values
('João da Silva', '12345678901', '11987654321', 'Rua A', '123', 'Apto 1', 'Centro', '12345678', 'São Paulo', 'SP'),
('Maria Oliveira', '23456789012', '11976543210', 'Rua B', '456', '', 'Jardim', '23456789', 'Rio de Janeiro', 'RJ'),
('Carlos Pereira', '34567890123', '11965432109', 'Rua C', '789', '', 'Vila Nova', '34567890', 'Belo Horizonte', 'MG');

SELECT setval(pg_get_serial_sequence('pessoa', 'id'), (SELECT MAX(id) FROM pessoa));