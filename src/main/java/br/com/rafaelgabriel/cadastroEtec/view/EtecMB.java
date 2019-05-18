package br.com.rafaelgabriel.cadastroEtec.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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
		etecSB.save(edit);
		showInsertMessage();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void saveMessage() {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Successful", "Your message: " + message));
		context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
	}
}
