// Datei: Fahrzeug.java

public class Fahrzeug {
	private String kennzeichen;
	private int anzahlSitze;
	
	public Fahrzeug(String kennzeichen, int anzahlSitze)
	{
		this.kennzeichen = kennzeichen;
		this.anzahlSitze = anzahlSitze;
	}
	
	public String toString()
	{
		return "Kennzeichen: " + kennzeichen + " Sitzplätze: " + anzahlSitze;
	}
}