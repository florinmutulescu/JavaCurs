package curs9;

public class Vehicul {
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;

	public Vehicul(String brand, String nivelPoluare, int vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie = vitezaMedie;
	}

	public String nume(String nume) {

		return nume;
	}

	public String motorizare(String motorizare) {
		return motorizare;
	}

	public void detalii() {
		System.out.println("Nivel de poluare pentru masina Dacia" + "este :5 si viteza medie atinsa este de 180 km/h");
	}

}
