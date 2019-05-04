package br.com.rafaelgabriel.cadastroEtec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="")
public class Etec {
	
	@Id
	@GeneratedValue
	@Column(name="")
	private int id;
	
	@Column(name="")
	private String nome;
	
	@Column(name="")
	private String cep;
	private String endereco;
	private String bairro;
	private String cidade;

}
