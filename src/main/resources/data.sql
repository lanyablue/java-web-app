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

INSERT INTO alura.pedido
(id, data_da_entrega, descricao, nome_produto, url_imagem, url_produto, valor_negociado, status)
VALUES('1',
'2020-02-17',
'Uma descrição qualquer para esse pedido',
'Xiaomi Smartphone Redmi 9A',
'https://m.media-amazon.com/images/I/81oPj2JzHDL._AC_SL1500_.jpg',
'https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Vers%C3%A3o-Global/dp/B08CGXVPXW/',
2000.00,
'APROVADO');
