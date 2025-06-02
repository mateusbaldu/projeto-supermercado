drop schema supermercado cascade;
drop database supermercado;

create database supermercado;
create schema supermercado;

set search_path to supermercado;

create table produtos_cadastrados (
    codigoDeBarras varchar(13) primary key not null,
    nome varchar(30) not null,
    categoria varchar(20),
    marca varchar(30),
    precoDeCompra decimal(10, 2)
);

create table funcionarios (
    cpf varchar(11) primary key not null,
    nome varchar(50) not null,
    cargo varchar(20),
    nivelDePermissao int
);

create table cadastroFornecedores (
    cnpj varchar(14) primary key not null,
    nome varchar(50) not null,
    endereco varchar(50),
    informacoesDeContato varchar(50)
);

create table registroPedidos (
    codigoDeBarras varchar(13) not null references produtos_cadastrados(codigoDeBarras) on delete restrict on update cascade,
    quantidade bigint,
    preco decimal(10,2)
);

create type status_estoque as enum ('estoque alto', 'disponivel', 'valor minimo', 'indisponivel');

create table estoque (
    idEstoque bigint primary key not null,
    codigoDeBarras varchar(13) not null references produtos_cadastrados (codigoDeBarras) on delete restrict on update cascade,
    cnpjFornecedor varchar(14) references cadastroFornecedores(cnpj) on delete restrict on update cascade,
    precoVenda decimal(10, 2),
    precoCompra decimal(10, 2) not null,
    quantidade integer,
    status status_estoque,
    alertaEstoqueBaixo boolean
);

create table vendas (
    idVenda bigint primary key not null,
    codigoDeBarrasNotaFiscal varchar(44),
    idDetalhesVenda bigint not null,
    formaDePagamento varchar(20),
    precoTotalVenda decimal(10, 2),
    precoPagoPeloCliente decimal(10,2),
    troco decimal(10, 2),
    dataVenda date,
    cpfCliente varchar(11)
);

create table detalhesVenda (
    idDetalhesVenda bigint primary key not null,
    idVenda bigint,
    codigoDeBarras varchar(44),
    nomeDoItem varchar(50),
    quantidade bigint,
    precoDoItem decimal (10,2),
    subtotal decimal(10, 2)
);

alter table vendas add constraint fk_detalhesvenda foreign key (iddetalhesvenda) references detalhesvenda(iddetalhesvenda) on delete restrict on update cascade;

alter table detalhesvenda add constraint fk_venda foreign key (idvenda) references vendas(idvenda) on delete restrict on update cascade;

create unique index idx_codigodebarrasnotafiscal on vendas (codigodebarrasnotafiscal);
alter table detalhesvenda add constraint fk_codigodebarras foreign key (codigodebarras) references vendas(codigodebarrasnotafiscal) on delete restrict on update cascade;