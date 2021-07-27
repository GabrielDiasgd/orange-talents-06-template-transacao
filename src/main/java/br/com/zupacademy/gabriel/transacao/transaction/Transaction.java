package br.com.zupacademy.gabriel.transacao.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Transaction {
	
	@Id
	private String id;
	@NotNull
	private BigDecimal value;
	@NotNull @ManyToOne(cascade = CascadeType.MERGE)
	private Establishment establishment;
	@NotNull @ManyToOne(cascade = CascadeType.MERGE)
	private Card card;
	@NotNull 
	private LocalDateTime effectedIn;
	
	@Deprecated
	public Transaction() {
	}
	
	public Transaction(String id, @NotNull BigDecimal value, @NotNull Establishment establishment, @NotNull Card card,
			@NotNull LocalDateTime effectedIn) {
		super();
		this.id = id;
		this.value = value;
		this.establishment = establishment;
		this.card = card;
		this.effectedIn = effectedIn;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", value=" + value + ", establishment=" + establishment.toString() + ", card=" + card.toString()
				+ ", effectedIn=" + effectedIn + "]";
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValue() {
		return value;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public Card getCard() {
		return card;
	}

	public LocalDateTime getEffectedIn() {
		return effectedIn;
	}
	
	
	
	

}
