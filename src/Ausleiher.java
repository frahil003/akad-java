// Datei: Ausleiher.java
public class Ausleiher extends Person {
	private int ausleiherNummer;
	
	public Ausleiher(String name, String vorname, int ausleiherNummer) {
		super(name, vorname);	// muss immer in der ersten Zeile stehen
		this.ausleiherNummer = ausleiherNummer;
	}
	
	public int getAusleiherNummer() {
		return ausleiherNummer;
	}
	
	public String toString() {
		return super.toString() + " mit Nummer " + ausleiherNummer;
	}
	
	// Kann entfallen, da im Konstruktor angegeben
	
	// public void setAusleiherNummer(int ausleiherNummer) {
	//	this.ausleiherNummer = ausleiherNummer;
	// }
}