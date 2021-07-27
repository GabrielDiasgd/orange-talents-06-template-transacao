package br.com.zupacademy.gabriel.transacao.transaction;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Card {
	
	@Id
	private String id;
	@NotBlank
	private String email;
	
	@Deprecated
	public Card() {
	}
	
	public Card(String id, @NotBlank String email) {
		super();
		this.id = id;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", email=" + email + "]";
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}
	
	
	
	
	

}
