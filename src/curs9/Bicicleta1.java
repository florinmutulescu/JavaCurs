package curs9;

public class Bicicleta1 extends Vehicul1 {

	public Bicicleta1(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}

	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + getNume() + " este " + getNivelPoluare()
				+ " si viteza medie atinsa este de " + getVitezaMedie() + " km/h");

	}

}
