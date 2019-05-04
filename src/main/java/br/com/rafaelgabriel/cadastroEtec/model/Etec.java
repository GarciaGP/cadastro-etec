package br.com.rafaelgabriel.cadastroEtec.model;

import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Etec {
	
	private int id;
	private String nome;
	private String cep;
	private String endereco;
	private String bairro;
	private String cidade;

}
