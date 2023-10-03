package curs9;

public class Bicicleta extends Vehicul {

	public Bicicleta(String brand, String nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}

	public String nume(String nume) {
		// System.out.println("Bicicleta se numeste MontainBike " + nume);
		return nume;
	}

	public String motorizare(String motorizare) {
		// System.out.println("Bicicleta are motorizare : " + motorizare);
		return motorizare;
	}

	public void detalii() {
		System.out.println(
				"Nivel de poluare pentru bicicleta Montainbike" + "este :0 si viteza medie atinsa este de 35 km/h");
	}
}
