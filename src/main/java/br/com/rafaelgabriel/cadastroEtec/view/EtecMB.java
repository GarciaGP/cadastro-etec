package br.com.rafaelgabriel.cadastroEtec.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.common.view.BaseMB;
import br.com.rafaelgabriel.cadastroEtec.business.EtecSB;
import br.com.rafaelgabriel.cadastroEtec.model.Etec;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")

public class EtecMB extends BaseMB {

	private String message;
	Etec etecAdd = new Etec();
	private List<Etec> registros;

	@Autowired
	private EtecSB etecSB;

	protected void postConstruct() {
		registros = etecSB.findAll();
	}

	private Etec edit = new Etec();

	public void onSave() {
		try {
			etecSB.save(edit);
			showInsertMessage();

		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}

	}

	public void onUpdate(Etec etec){
		
	} 

	public void onRemove(Etec etec) {
		etecSB.remove(etec);
		registros = etecSB.findAll();
		showDeleteMessage();
	}

}
