drop database cad_etec_cps;
create database cad_etec_cps;
use cad_etec_cps;
create table etec
	(id bigint not null primary key,
	 nome varchar(50) not null,
     codigo int not null,
     cep varchar(8) not null,
     latitude double not null,
     longitude double not null);
