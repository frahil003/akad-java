// Datei: TestPersonRef.java

public class TestPersonRef {

	public static void main(String[] args) {
		// Referenzvariable refPerson vom Typ anlegen und
		// mit null initialisieren
		Person refPerson = null;
		refPerson = new Person();
		
		refPerson.setName("Hilgenberg");
		refPerson.setVorname("Frank");
		// Name und Vorname der ersten Person ausgeben
		System.out.println(refPerson.getName() + " " + refPerson.getVorname());
		
		// Die Referenzvariable refPerson zeigt jetzt auf ein neus
		// Objekt vom Typ Person
		refPerson.setName("Meister");
		refPerson.setVorname("Ralf");
		// Name und Vorname der zweiten Person ausgeben
		System.out.println(refPerson.getName() + " " + refPerson.getVorname());
		
		
			
		
	}
}