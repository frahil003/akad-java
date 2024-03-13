
public class FuhrparkTest {

	public static void main(String[] args) {
		Fuhrpark fuhrpark = new Fuhrpark();
		Fahrzeug f1 = new Fahrzeug("S AB 123", 5);
		fuhrpark.aufnehmen(f1);
		Fahrzeug f2 = new Fahrzeug("MH DF 33", 4);
		fuhrpark.aufnehmen(f2);
		Fahrzeug f3 = new Fahrzeug("DO AL 286", 6);
		fuhrpark.aufnehmen(f3);
		
		fuhrpark.ausgeben();
		
		System.out.println("Fahrzeug 2 ausbuchen");
		fuhrpark.ausbuchen(f2);
		
		fuhrpark.ausgeben();
	}
}