package br.com.zupacademy.gabriel.transacao.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstablishmentMessage {
	
	@JsonProperty(value = "nome")
	private String name;
	@JsonProperty(value =  "cidade")
	private String city;
	@JsonProperty(value = "endereco")
	private String address;
	
	@Override
	public String toString() {
		return "EstablishmentResponse [name=" + name + ", city=" + city + ", address=" + address + "]";
	}

	
}
