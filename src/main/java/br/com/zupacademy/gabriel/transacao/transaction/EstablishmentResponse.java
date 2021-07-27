package br.com.zupacademy.gabriel.transacao.transaction;

public class EstablishmentResponse {

	private String name;
	private String city;
	private String address;

	
	public EstablishmentResponse(Establishment establishment) {
		this.name = establishment.getName();
		this.city = establishment.getCity();
		this.address = establishment.getAddress();
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
