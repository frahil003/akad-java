// Datei: Zeitschrift.java

package entitaeten;

public class Zeitschrift extends Medium {
	
	private static int bestand = 0;
	
	// Konstruktor für die Klasse zur Initialisierung
	// der Datenfelder
	public Zeitschrift (String titel, String unterTitel, String issn, int anzahlExemplare) {
		super(titel, unterTitel, issn, anzahlExemplare);
		// Bei der Objekterzeugung wird die Klassenvariable
		// bestand um eins erhöht
		bestand++;
	}
	// Zweiter Konstruktor mit 3 Parametern ohne Untertitel
	public Zeitschrift (String titel, String issn, int anzahlExemplare) {
		this(titel, "", issn, anzahlExemplare);
	}
			
//	public void ausgeben() {	
//		System.out.println("[Zeitschrift]" + titel + " mit ISSN: " + mediumNummer + ", Bestand: " + anzahlExemplare);
//	}
	
	public static int getbestand() {
		return bestand;
	}
	
	public String toString() {
		return "[Zeitschrift]: " + super.toString();
	}
}