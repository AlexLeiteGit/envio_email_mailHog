package br.com.envio_email_mailHog.dto;

import br.com.envio_email_mailHog.model.Email;

public class EmailLayout {
	
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	private static final String QUEBRA_DE_LINHA = "<br>";
	
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Adinstrador")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicito alteração de senha do sistema.")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
		
	}
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("Atenciosamente,")
				.append(QUEBRA_DE_LINHA)
				.append("Alex Ferreira Leite")
				.append(QUEBRA_DE_LINHA_DUPLA)
				.toString();
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("Email automático. Favor não responder esse e-mail!").toString();
	}
}
