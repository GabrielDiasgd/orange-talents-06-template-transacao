package br.com.zupacademy.gabriel.transacao.consumer;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.zupacademy.gabriel.transacao.transaction.Establishment;

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

	public @NotNull Establishment toModel() {
		return new Establishment(this.name, this.city, this.address);
	}

	
}
