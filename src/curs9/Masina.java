package curs9;

public class Masina extends Vehicul {

	public Masina(String brand, String nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}

	public String nume(String nume) {
		// System.out.println("Masina se numeste: " + nume);
		return nume;
	}

	public String motorizare(String motorizare) {
		// System.out.println("Masina are motorizare : " + motorizare);
		return motorizare;
	}

	public void detalii() {
		System.out.println("Nivel de poluare pentru masina Dacia" + " este :5 si viteza medie atinsa este de 180 km/h");
	}

}
