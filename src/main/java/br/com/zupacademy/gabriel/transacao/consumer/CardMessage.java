package br.com.zupacademy.gabriel.transacao.consumer;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.zupacademy.gabriel.transacao.transaction.Card;

public class CardMessage {
	
	@JsonProperty
	private String id;
	@JsonProperty
	private String email;

	@Override
	public String toString() {
		return "CardResponse [id=" + id + ", email=" + email + "]";
	}

	public @NotNull Card toModel() {
		return new Card(this.id, this.email);
	}
	
	

}
