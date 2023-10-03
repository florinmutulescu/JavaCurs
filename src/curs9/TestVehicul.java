package curs9;

public class TestVehicul {

	public static void main(String[] args) {
		TestVehicul tv = new TestVehicul();

		Vehicul bic = new Bicicleta("MontainBike", "0", 35);
		Vehicul mas = new Masina("Dacia", "5", 120);

		System.out.println(mas.nume(" Dacia ") + mas.motorizare("1600"));
		System.out.println(bic.nume("MontainBike ") + bic.motorizare("zero"));
		System.out.println("------------------------");

		tv.verificaMotorizare(bic);
		tv.verificaMotorizare(mas);
		bic.detalii();
		mas.detalii();

	}

	public void verificaMotorizare(Vehicul v) {

		System.out.println(v.nume("E 90"));
		System.out.println(v.motorizare("2000"));
	}

}
