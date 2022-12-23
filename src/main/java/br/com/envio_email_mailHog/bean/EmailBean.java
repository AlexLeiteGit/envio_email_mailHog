package br.com.envio_email_mailHog.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.envio_email_mailHog.dto.EmailLayout;
import br.com.envio_email_mailHog.model.Email;
import br.com.envio_email_mailHog.service.EmailService;

@Named("emailBean")
@RequestScoped
public class EmailBean implements Serializable{

	private static final long serialVersionUID = 8305824041971521860L;
	
	private static final String DESTINATARIO = "alex.f.leite@gmail.com";
	private static final String ASSUNTO = "Mudança de Senha";
	
	@Inject
	private EmailService emailService;
	
	private String enviarEmail() {
		emailService.enviar(montarEmail());
		System.out.println("email enviado");
		return null;
	}
	
	private Email montarEmail() {
		EmailLayout layout = new EmailLayout();
		System.out.println("email montado");
		return layout.montarEmailAdministrador(DESTINATARIO, ASSUNTO);
	}

}
