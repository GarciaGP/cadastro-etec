package br.com.rafaelgabriel.cadastroEtec.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.common.business.BaseSB;
import br.com.rafaelgabriel.cadastroEtec.dao.EtecDAO;
import br.com.rafaelgabriel.cadastroEtec.model.Etec;

@Service
public class EtecSB extends BaseSB{
	
	private EtecDAO etecDAO;
	
	@Override
	protected void postConstructImpl()
	{
		etecDAO = getDAO(EtecDAO.class);
	}
	
	public List<Etec> findAll(){
		return etecDAO.findAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Etec etec) {
		etecDAO.save(etec);
		
	}
}