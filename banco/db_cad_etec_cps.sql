drop database cad_etec_cps;
create database cad_etec_cps;
use cad_etec_cps;
create table etec
	(id		    bigint 			not null 	primary key 	auto_increment,
	 nome 		varchar(50)		not null,
     codigo 	int 			not null,
     endereco 	varchar(120) 	not null,
     bairro 	varchar(60) 	not null,
     cidade 	varchar(60) 	not null,
     cep 		varchar(8) 		not null,
     latitude 	double 			not null,
     longitude 	double 			not null);

select * from etec