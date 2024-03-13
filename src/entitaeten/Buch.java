// Datei: Buch.java

package entitaeten;

import java.util.Scanner;

public class Buch extends Medium {
	
	private static int bestand = 0;
	
	// Konstruktor für die Klasse zur Initialisierung
	// der Datenfelder
	public Buch (String titel, String unterTitel, String isbn, int anzahlExemplare) {
		super(titel, unterTitel, isbn, anzahlExemplare);
		// Bei Objekterzeugung: Klassenvariable bestand um eins erhöhen
		bestand++;
	}
	
	// Zweiter Konstruktor mit 3 Parameter der Klasse Buch ohne Untertitel
	public Buch (String titel, String isbn, int anzahlExemplare) {
		this (titel, "", isbn, anzahlExemplare);
	}
	
	public Buch(Scanner eingabe)
	{
		super(eingabe);
		
		System.out.print("Bitte geben Sie die ISBN ein: ");
		mediumNummer = eingabe.nextLine();
		// Bei Objekterzeugung: Klassenvariable bestand um eins erhöhen
		bestand++;
	}

	
//	public void ausgeben() {
//		System.out.println("[Buch]" + titel + " mit ISBN: " + mediumNummer + ", Bestand: " + anzahlExemplare);
//	}
	
	public static int getBestand() {
		return bestand;
	}
	
	public String toString() {
		return "[Buch]: " + super.toString();
	}
}