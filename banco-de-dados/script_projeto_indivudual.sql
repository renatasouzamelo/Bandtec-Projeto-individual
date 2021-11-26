create database projeto_bandtec;
use projeto_bandtec;

create table cliente
(id_cliente int primary key auto_increment,
nomeCliente varchar (45),
sobrenomeCliente varchar (45),
emailCliente varchar (45),
senha varchar (45)
)auto_increment = 1000;

select * from cliente;


INSERT INTO cliente (nomeCliente, sobrenomeCliente,  emailCliente, senha) values 
('renata', 'melo','renata.melo@bandtec.com.br', 'Bd@123'),
('fabio','souza', 'fabio.souza@bandtec.com.br', 'Cd@123'),
('sara', 'faria','sara.faria@bandtec.com.br', 'Df@123'),
('sofia','carvalho', 'sofia.carvalho@bandtec.com.br', 'bd@123');



create table livraria
(id_livraria int primary key auto_increment,
nomeLivraria varchar (45),
contatoLivraria varchar (45),
emailLivraria varchar (45),
endereçoLivraria varchar (45),
faturamentoLivraria decimal (10,2)
)auto_increment = 2000;

INSERT INTO  livraria (nomeLivraria, contatoLivraria,  emailLivraria, endereçoLivraria, faturamentoLivraria ) values 
('saraiva', '987876767','saraiva@saraiva.com.br', 'av ibirapuera-100', 2000.00),
('cultura', '987126767','cultura@livrariacultura.com.br', 'av morumbi-2200', 14000.00),
('fnac', '987126767','cultura@livrariacultura.com.br', 'av morumbi-2200', 14000.00),
('livro mais', '56569898','livromais@livrariamais.com.br', 'av sapopenba-2200', 12000.00);
 


select * from livraria;


create table historico
(id_historico int primary key auto_increment,
fk_cliente int,
fk_livraria int,
foreign key (fk_cliente) references cliente (id_cliente),
foreign key (fk_livraria) references livraria (id_livraria),
quantidadeVendas int,
contatoLivraria varchar (45)
)auto_increment = 3000;




select * from historico;

INSERT INTO  historico (fk_cliente, fk_livraria,  quantidadeVendas, contatoLivraria ) values 
(1000, 2000,'40490', '1156783443'),
(1001, 2001,'14490', '1156783443'),
(1002, 2002,'15490', '1156783443'),
(1003, 3,'16490', '1156783443');

create table livro
(id_livro int primary key auto_increment,
nomeLivro varchar (45),
categoria varchar (45),
editoralLivraria varchar (45),
fk_livraria int,
foreign key (fk_livraria) references livraria (id_livraria)
)auto_increment = 4000;


select * from livro;




INSERT INTO  livro (nomeLivro,  categoria, editoralLivraria, fk_livraria ) values 
('O cortiço', 'literatura nacional', 'abril', 2000),
('O sol tambem se levanta', 'literatura americana', 'abril', 2001),
('memorias póstumas de braz cubas', 'literatura nacional', 'mais vida', 2002),
('a mao e a luva', 'literatura cientifica', 'abril', 2003);





select cl.nomeCliente, cl.emailCliente from cliente cl;

select count(*) as contagem, categoria from livro group by categoria;
