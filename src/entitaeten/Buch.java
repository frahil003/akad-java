// Datei: Buch.java

package entitaeten;

public class Buch implements Ausgebbar {
	
	private String titel;
	private String unterTitel;
	private String isbn;
	private int anzahlExemplare;
	
	// Konstruktor für die Klasse zur Initialisierung
	// der Datenfelder
	public Buch (String t, String u, String i, int anzahl) {
		titel = t;
		unterTitel = u;
		isbn = i;
		anzahlExemplare = anzahl;
	}
	
	public void ausgeben() {
		System.out.println("[Buch]" + titel + " mit ISBN: " + isbn + ", Bestand: " + anzahlExemplare);
	}
}