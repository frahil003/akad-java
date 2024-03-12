// Datei: Medium.java

package entitaeten;

public class Medium {
	protected String titel;
	protected String unterTitel;
	protected String mediumNummer;
	protected int anzahlExemplare;
	
	// Konstruktor für die Klasse zur Initialisierung
	// der Datenfelder
	public Medium(String titel, String unterTitel, String mediumNummer, int anzahlExemplare) {
		this.titel = titel;
		this.unterTitel = unterTitel;
		this.mediumNummer = mediumNummer;
		this.anzahlExemplare = anzahlExemplare;		
	}
	
//	public void ausgeben() {
//		System.out.println("[Medium] " + titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare);
//		
//	}
	
	public String toString() {
		return titel + " : " + unterTitel + " : " + mediumNummer + " : " + anzahlExemplare;
	}

}
