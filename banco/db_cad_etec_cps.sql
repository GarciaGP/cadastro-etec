create database cad_etec_cps;
use cad_etec_cps;
create table cadastro
	(id int not null primary key,
	 nome varchar(50) not null,
     codigo int not null,
     cep numeric(8) not null,
     endereco varchar(50) not null,
     bairro varchar(30) not null,
     cidade varchar(30) not null);
     
