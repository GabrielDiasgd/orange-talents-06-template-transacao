package br.com.zupacademy.gabriel.transacao.consumer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.zupacademy.gabriel.transacao.transaction.Transaction;

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

	public Transaction toModel() {
		return new Transaction(this.id, this.value,this.establishment.toModel(), this.card.toModel(), this.effectedIn);
	}
	
	
	
	
	

}
