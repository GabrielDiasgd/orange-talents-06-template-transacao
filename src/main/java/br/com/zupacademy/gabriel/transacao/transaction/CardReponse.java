package br.com.zupacademy.gabriel.transacao.transaction;

public class CardReponse {
	
	private String id;
	
	private String email;
	
	public CardReponse(Card card) {
		this.id = card.getId();
		this.email = card.getEmail();
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}
	
	
	

}
