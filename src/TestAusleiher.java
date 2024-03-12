// Datei: TestAusleiher.java
public class TestAusleiher {

	public static void main(String[] args) {
		
		Ausleiher a1 = new Ausleiher("Mustermann", "Max", 123456);
		Ausleiher a2 = new Ausleiher("Hilgenberg", "Frank", 976541);
		
		// Aufruf der gerbten Methoden für den Ausleiher
		// a1.setName("Mustermann");
		// a1.setVorname("Max");
		
		// Aufruf der eigenen Methode von Ausleiher
		// a1.setAusleiherNummer(29031970);
		
		System.out.println(a1.getName() + " " + a1.getVorname());
		System.out.println("mit Nummer: " + a1.getAusleiherNummer());
		
		System.out.println();
		
		System.out.println(a1.toString());
		System.out.println(a1);		
		System.out.println(a2);

		System.out.println();
		
		if(a1 == a2) {
			System.out.println("a1 und a2 sind gleich");			
		} else {
			System.out.println("a1 und a2 sind NICHT gleich");				
		}
		
	}
}