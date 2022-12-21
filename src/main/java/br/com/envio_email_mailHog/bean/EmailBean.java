package br.com.envio_email_mailHog.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.envio_email_mailHog.dto.EmailLayout;
import br.com.envio_email_mailHog.model.Email;
import br.com.envio_email_mailHog.service.EmailService;

@Named
@RequestScoped
public class EmailBean implements Serializable{

	private static final long serialVersionUID = 8305824041971521860L;
	
	@Inject
	private EmailService emailService;
	
	private String enviarEmail() {
		emailService.enviar(montarEmail());
		return null;
	}
	
	private Email montarEmail() {
		EmailLayout layout = new EmailLayout();
		
		return layout.montarEmailAdministrador("alex.f.leite@gmail.com", "Mudança de Senha Java");
	}

}
