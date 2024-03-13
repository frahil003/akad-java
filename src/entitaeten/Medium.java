// Datei: Medium.java

package entitaeten;

import java.util.Scanner;

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
	
	public Medium(Scanner eingabe)
	{
		System.out.print("\nBitte geben sie den Titel ein: ");
		titel = eingabe.nextLine();
		
		System.out.print("Bitte geben Sie den Untertitel ein: ");
		unterTitel = eingabe.nextLine();
		
		System.out.print("Bitte geben Sie Exemplare ein: ");
		anzahlExemplare = eingabe.nextInt();
		
		eingabe.nextLine();		
	}
	
//	public void ausgeben() {
//		System.out.println("[Medium] " + titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare);
//		
//	}
	
	public String toString()
	{
		return titel + " : " + unterTitel + " : " + mediumNummer + " : " + anzahlExemplare;
	}

}
