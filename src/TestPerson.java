// Datei: TestPerson.java

public class TestPerson {

	public static void main(String[] args) {
		// Objekt der Klasse Person anlegen
		// Person p1 = new Person();
		Person p1 = new Person();
		
		// Datenfelder mit Werten belegen.
		p1.setName("Hilgenberg");
		p1.setVorname("Frank");
		
		// Nochmal ein Objekt der Klasse Person anlegen
		Person p2;
		p2 = new Person();
		
		// Datenfelder mit Werten belegen
		p2.setName("Meister");
		p2.setVorname("Ralf");
		
		// Name und Vorname der Personen ausgeben.
		System.out.println("Nachname: " + p1.getName() + " " + p1.getVorname());
		System.out.println(p2.getName() + " " + p2.getVorname());
		
			
		
	}
}