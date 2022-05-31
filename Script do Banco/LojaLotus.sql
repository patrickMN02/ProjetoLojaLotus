drop database if exists LojaLotus;
create database LojaLotus;
use LojaLotus;

create table Tamanho(
id int primary key auto_increment,
tamanho varchar(4)
);
insert into Tamanho (id, tamanho) values (null, "PP");
insert into Tamanho (id, tamanho) values (null, "P");
insert into Tamanho (id, tamanho) values (null, "M");
insert into Tamanho (id, tamanho) values (null, "G");
insert into Tamanho (id, tamanho) values (null, "GG");
insert into Tamanho (id, tamanho) values (null, "XG");

create table Tecido(
id int primary key auto_increment,
tipoTecido varchar(20)
);
create table CorProduto(
id int primary key auto_increment,
cor varchar(15)
);
create table CadastroVendedor(
id int primary key auto_increment,
cpf int,
nome varchar (30)
);
create table CadastroFornecedor(
id int primary key auto_increment,
cnpj longtext,
razaoSocial varchar(30),
telComercial longtext,
celular longtext,
emailComercial varchar (30)
);
create table Produto(
id int primary key auto_increment,
codBarras int,
precoCusto double, 
precoVenda double,
colecao varchar (15),
id_fornecedor int references CadastroFornecedor(id),
id_tamanho int references Tamanho(id),
id_tecido int references Tecido(id),
id_corProduto int references CorProduto (id)
);
create table CadastroCliente(
id int primary key auto_increment,
cpf varchar(20),
rg varchar(12),
dataNasc longtext,
dataCadastro varchar(15),
nomeCliente varchar (45),
endereco varchar (45),
numero varchar(10),
complemento varchar (15),
bairro varchar (45),
cep longtext,
cidade varchar (20),
estado longtext,
pais varchar (20),
emailPessoal varchar(45),
emailComercial varchar (45),
celular longtext,
telResidencial varchar(45),
telComercial varchar(45),
observacoes varchar(500)
);
create table Vendas(
id int primary key auto_increment,
dataEmissao int,
horaEmissao int,
subtotal float,
descontos float,
total float,
observacoes varchar(500),
id_vendedor int references CadastroVendedor(id),
id_cliente int references CadastroCliente(id),
id_produto int references CadastroProduto(id)
)
select * from CadastroCliente;
select * from CadastroFornecedor;
