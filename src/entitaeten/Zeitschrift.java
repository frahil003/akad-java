// Datei: Zeitschrift.java

package entitaeten;

public class Zeitschrift implements Ausgebbar{
	
	private String titel;
	private String unterTitel;
	private String issn;
	private int anzahlExemplare;
	private int jahr;
	
	// Konstruktor für die Klasse zur Initialisierung
	// der Datenfelder
		public Zeitschrift (String t, String u, String i, int anzahl, int j) {
			titel = t;
			unterTitel = u;
			issn = i;
			anzahlExemplare = anzahl;
			jahr = j;
		}
			
		public void ausgeben()
		{	
			System.out.println("[Zeitschrift]" + titel + " mit ISSN: " + issn + ", Bestand: " + anzahlExemplare + ", Jahr: " + jahr);
		}
}