package br.com.zupacademy.gabriel.transacao.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionResponse {
	
	private String id;
	private BigDecimal value;
	private EstablishmentResponse establishmentResponse;
	private CardReponse cardResponse;
	private LocalDateTime effectedIn;
	
	public TransactionResponse(Transaction transaction) {
		this.id = transaction.getId();
		this.value = transaction.getValue();
		this.establishmentResponse = new EstablishmentResponse(transaction.getEstablishment());
		this.cardResponse = new CardReponse(transaction.getCard());
		this.effectedIn = transaction.getEffectedIn();
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public EstablishmentResponse getEstablishmentResponse() {
		return establishmentResponse;
	}

	public CardReponse getCardResponse() {
		return cardResponse;
	}

	public LocalDateTime getEffectedIn() {
		return effectedIn;
	}
	
	
	

	
}
