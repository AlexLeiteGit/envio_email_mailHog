package br.com.envio_email_mailHog.dto;

import br.com.envio_email_mailHog.model.Email;

public class EmailLayout {
	
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		return new Email(destinatario, assunto, texto.toString());
		
	}

}
