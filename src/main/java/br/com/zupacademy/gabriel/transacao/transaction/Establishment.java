package br.com.zupacademy.gabriel.transacao.transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Establishment {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String name;

	@NotBlank
	private String city;

	@NotBlank
	private String address;
	
	@Deprecated
	public Establishment() {
	}

	public Establishment(@NotBlank String name, @NotBlank String city, @NotBlank String address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Establishment [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}
	
	
	

}
