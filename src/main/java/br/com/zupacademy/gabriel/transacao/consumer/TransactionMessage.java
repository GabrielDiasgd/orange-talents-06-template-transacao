package br.com.zupacademy.gabriel.transacao.consumer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionMessage {
	
	private String id;
	@JsonProperty(value = "valor")
	private BigDecimal value;
	@JsonProperty("estabelecimento")
	private EstablishmentMessage establishment;
	@JsonProperty(value = "cartao")
	private CardMessage card;
	@JsonProperty(value = "efetivadaEm")
	private LocalDateTime effectedIn;

	@Override
	public String toString() {
		return "TransactionMessage [id=" + id + ", value=" + value + ", establishment=" + establishment.toString()
				+ ", card=" + card.toString() + ", effectedIn=" + effectedIn + "]";
	}

	public String getId() {
		return id;
	}
	
	
	
	
	

}
