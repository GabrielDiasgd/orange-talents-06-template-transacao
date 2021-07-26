package br.com.zupacademy.gabriel.transacao.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardMessage {
	
	@JsonProperty
	private String id;
	@JsonProperty
	private String email;

	@Override
	public String toString() {
		return "CardResponse [id=" + id + ", email=" + email + "]";
	}
	
	

}
