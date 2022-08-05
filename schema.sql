create table if not exists pedido (
id bigint not null auto_increment,
data_da_entrega date,
descricao varchar(255),
nome_produto varchar(50),
url_imagem varchar(255),
url_produto varchar(255),
valor_negociado decimal(19,2),
status varchar(50),
constraint pk_tb_pedido primary key (id),
constraint uc_tb_pedido unique(id)
);