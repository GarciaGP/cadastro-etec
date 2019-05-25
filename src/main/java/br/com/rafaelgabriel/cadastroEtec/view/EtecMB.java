package br.com.rafaelgabriel.cadastroEtec.view;

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

	@Autowired
	private EtecSB etecSB;

	private Etec edit = new Etec();

	public void onSave() {
		try {
			etecSB.save(edit);
			showInsertMessage();

		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}

	}

}
