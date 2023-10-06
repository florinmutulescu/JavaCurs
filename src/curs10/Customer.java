package curs10;

public class Customer {

	private String name;
	private String adress;
	private String email;

	public Customer(String name, String adress, String email) {
		this.name = name;
		this.adress = adress;
		this.email = email;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
