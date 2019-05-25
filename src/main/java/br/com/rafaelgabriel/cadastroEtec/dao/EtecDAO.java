package br.com.rafaelgabriel.cadastroEtec.dao;

import java.util.List;

import br.com.etechoracio.common.dao.BaseDAO;
import br.com.rafaelgabriel.cadastroEtec.model.Etec;

public interface EtecDAO extends BaseDAO<Etec> {

	public List<Etec> findByNomeOrCodigo(String nome, int codigo);

}
