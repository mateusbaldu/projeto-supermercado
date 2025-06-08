drop schema supermercado cascade;
drop database supermercado;

create database supermercado;
create schema supermercado;

set search_path to supermercado;

create table produtos_cadastrados (
    codigoDeBarras varchar(13) primary key not null,
    nome varchar(100) not null,
    categoria varchar(50),
    marca varchar(50),
    precoDeCompra decimal(10, 2) not null,
    dataDeValidade date
);

create table funcionarios (
    cpf varchar(11) primary key not null,
    nome varchar(100) not null,
    cargo varchar(50),
    nivelDePermissao int
);

create table cadastroFornecedores (
    cnpj varchar(14) primary key not null,
    nome varchar(100) not null,
    endereco varchar(100),
    informacoesDeContato varchar(100)
);

create table registroPedidos (
    idRegistroPedido bigserial primary key not null,
    codigoDeBarras varchar(13) not null references produtos_cadastrados(codigoDeBarras) on delete restrict on update cascade,
    cnpjFornecedor varchar(14) not null references cadastroFornecedores(cnpj) on delete restrict on update cascade,
    quantidade bigint,
    dataDoPedido date,
    precoTotalPedido decimal(10,2)
);

create type status_estoque as enum ('estoque alto', 'disponivel', 'quantidade mínima', 'indisponivel');

create table estoque (
    idEstoque bigserial primary key not null,
    codigoDeBarras varchar(13) not null references produtos_cadastrados (codigoDeBarras) on delete restrict on update cascade,
    cnpjFornecedor varchar(14) references cadastroFornecedores(cnpj) on delete restrict on update cascade,
    precoVenda decimal(10, 2),
    precoCompra decimal(10, 2) not null,
    quantidade integer,
    dataDeValidade date,
    status status_estoque not null,
    alertaEstoqueBaixo boolean
);

create table vendas (
    idVenda bigserial primary key not null,
    codigoDeBarrasNotaFiscal varchar(44) unique not null,
    formaDePagamento varchar(20),
    precoTotalVenda decimal(10, 2),
    precoPagoPeloCliente decimal(10,2),
    troco decimal(10, 2),
    dataVenda date,
    cpfCliente varchar(11)
);

create table detalhesVenda (
    idDetalhesVenda bigserial primary key not null,
    idVenda bigint not null references vendas(idVenda) on delete restrict on update cascade,
    codigoDeBarrasProduto varchar(13) references produtos_cadastrados(codigoDeBarras) on delete restrict on update cascade,
    nomeDoItem varchar(50),
    quantidade bigint,
    precoDoItem decimal (10,2),
    subtotal decimal(10, 2)
);


insert into produtos_cadastrados (codigoDeBarras, nome, categoria, marca, precoDeCompra, dataDeValidade)
values ('7907736697579', 'Biscoito Oreo', 'Biscoitos recheados', 'Mondelez', 1.20, '2026-06-08');
insert into produtos_cadastrados (codigoDeBarras, nome, categoria, marca, precoDeCompra, dataDeValidade)
values ('7905764575586', 'Biscoito Trakinas', 'Biscoitos recheados', 'Mondelez', 0.90, '2026-06-08');
insert into produtos_cadastrados (codigoDeBarras, nome, categoria, marca, precoDeCompra, dataDeValidade)
values ('7898076580389', 'Biscoito Negresco', 'Biscoitos recheados', 'Nestlé', 0.90, '2026-06-08');


insert into funcionarios (cpf, nome, cargo, nivelDePermissao)
values ('55426066876', 'Luccas Miguel', 'Atendente de Caixa', 1);
insert into funcionarios (cpf, nome, cargo, nivelDePermissao)
values ('62521958042', 'Pedro Dantas', 'Gerente de Vendas', 3);
insert into funcionarios (cpf, nome, cargo, nivelDePermissao)
values ('93271888531', 'Miguel Gonsaga', 'Administrador de Sistema', 6);


insert into cadastroFornecedores (cnpj, nome, endereco, informacoesDeContato)
values ('12345678000190', 'Dois Irmãos Varejo Ltda.', 'Rua das Casinhas, 123 - Centro, São Paulo - SP', 'contato@doisirmaos.com');
insert into cadastroFornecedores (cnpj, nome, endereco, informacoesDeContato)
values ('98765432000100', 'Kendrick Lamar Atacado e Varejo S.A.', 'Av. Principal, 456 - Vila Olímpia, São Paulo - SP', '(11) 98765-4321');
insert into cadastroFornecedores (cnpj, nome, endereco, informacoesDeContato)
values ('45678910000121', 'Alimentos Naturais Ltda.', 'Estrada do Campo, 789 - Morumbi, São Paulo - SP', '(11) 3210-9876');


insert into registroPedidos (codigoDeBarras, quantidade, dataDoPedido, precoTotalPedido, cnpjFornecedor)
values ('7907736697579', 30, '2025-06-08', 36.00, '12345678000190');
insert into registroPedidos (codigoDeBarras, quantidade, dataDoPedido, precoTotalPedido, cnpjFornecedor)
values ('7905764575586', 20, '2025-06-08', 18.00, '12345678000190');
insert into registroPedidos (codigoDeBarras, quantidade, dataDoPedido, precoTotalPedido, cnpjFornecedor)
values ('7898076580389', 20, '2025-06-08', 18.00, '12345678000190');


insert into estoque (codigoDeBarras, cnpjFornecedor, precoVenda, precoCompra, quantidade, status, alertaEstoqueBaixo, dataDeValidade)
values ('7907736697579', '12345678000190', 3.50, 1.20, 30, 'disponivel', false, '2026-06-08');
insert into estoque (codigoDeBarras, cnpjFornecedor, precoVenda, precoCompra, quantidade, status, alertaEstoqueBaixo, dataDeValidade)
values ('7905764575586', '12345678000190', 3.00, 0.90, 20, 'quantidade mínima', false, '2026-06-08');
insert into estoque (codigoDeBarras, cnpjFornecedor, precoVenda, precoCompra, quantidade, status, alertaEstoqueBaixo, dataDeValidade)
values ('7898076580389', '12345678000190', 3.00, 0.90, 20, 'quantidade mínima', false, '2026-06-08');


insert into vendas (codigoDeBarrasNotaFiscal, formaDePagamento, precoTotalVenda, precoPagoPeloCliente, troco, dataVenda, cpfCliente)
values ('35250642003368000190552233418767641242496249', 'Dinheiro', 12.50, 15.00, 2.50, '2025-06-08', '');
insert into vendas (codigoDeBarrasNotaFiscal, formaDePagamento, precoTotalVenda, precoPagoPeloCliente, troco, dataVenda, cpfCliente)
values ('35250623937064000137550670800874181030403960', 'Cartao de Credito', 16.00, 20.00, 4.00, '2025-06-08', '');
insert into vendas (codigoDeBarrasNotaFiscal, formaDePagamento, precoTotalVenda, precoPagoPeloCliente, troco, dataVenda, cpfCliente)
values ('35250632102084000100552256094931561411533235', 'Pix', 9.50, 10.00, 0.50, '2025-06-08', '');


insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250642003368000190552233418767641242496249'),
    '7907736697579', 'Biscoito Oreo', 1, 3.50, 3.50
);
insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250642003368000190552233418767641242496249'),
    '7905764575586', 'Biscoito Trakinas', 2, 3.00, 6.00
);
insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250642003368000190552233418767641242496249'),
    '7898076580389', 'Biscoito Negresco', 1, 3.00, 3.00
);


insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250623937064000137550670800874181030403960'),
    '7907736697579', 'Biscoito Oreo', 2, 3.50, 7.00
);
insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250623937064000137550670800874181030403960'),
    '7905764575586', 'Biscoito Trakinas', 1, 3.00, 3.00
);
insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250623937064000137550670800874181030403960'),
    '7898076580389', 'Biscoito Negresco', 2, 3.00, 6.00
);


insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250632102084000100552256094931561411533235'),
    '7907736697579', 'Biscoito Oreo', 1, 3.50, 3.50
);
insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250632102084000100552256094931561411533235'),
    '7905764575586', 'Biscoito Trakinas', 1, 3.00, 3.00
);
insert into detalhesVenda (idVenda, codigoDeBarrasProduto, nomeDoItem, quantidade, precoDoItem, subtotal)
values (
    (select idVenda from vendas where codigoDeBarrasNotaFiscal = '35250632102084000100552256094931561411533235'),
    '7898076580389', 'Biscoito Negresco', 1, 3.00, 3.00
);