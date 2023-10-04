package curs9;

public class Vehicul1 {

	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;

	public Vehicul1(String brand, int nivelPoluare, int vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie = vitezaMedie;
	}

	public String getNume() {
		return brand;
	}

	public String getMotorizare() {
		return "Nivelul de poluare pentru " + brand + " este " + nivelPoluare;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + brand + " este " + nivelPoluare
				+ " si viteza medie atinsa este de " + vitezaMedie + " km/h");
	}
}
