package curs9;

public class TestVehicul1 {

	public static void verificareMotorizare(Vehicul1 vehicul) {
		System.out.println("Numele vehiculului: " + vehicul.getNume());
		System.out.println(vehicul.getMotorizare());
	}

	public static void main(String[] args) {
		Bicicleta1 bicicleta = new Bicicleta1("MontainBike", 0, 20);
		Masina1 masina = new Masina1("BMW", 3, 180);

		verificareMotorizare(bicicleta);
		verificareMotorizare(masina);

		bicicleta.detaliiVehicul();
		masina.detaliiVehicul();

	}

}
