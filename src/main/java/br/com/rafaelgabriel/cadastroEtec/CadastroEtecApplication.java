package br.com.rafaelgabriel.cadastroEtec;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CadastroEtecApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroEtecApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
		return new ServletRegistrationBean<FacesServlet>(new FacesServlet(), "*.xhtml");
	}

}
