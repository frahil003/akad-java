// Datei: TestAusleiher.java
public class TestAusleiher {

	public static void main(String[] args) {
		
		Ausleiher a1 = new Ausleiher();
		
		// Aufruf der gerbten Methoden für den Ausleiher
		a1.setName("Mustermann");
		a1.setVorname("Max");
		
		a1.setAusleiherNummer(29031970);
		
		System.out.println(a1.getName() + " " + a1.getVorname());
		
		System.out.println("mit Nummer: " + a1.getAusleiherNummer());
	}
}