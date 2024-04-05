// Datei: Medium.java

package entitaeten;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Medium implements Comparable<Medium>{
	protected String titel;
	protected String unterTitel;
	protected String mediumNummer;
	protected int anzahlExemplare;
	
	// Konstruktor für die Klasse zur Initialisierung der Datenfelder
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
		
		while (true)
		{
			try
			{
				System.out.print("Bitte geben Sie Exemplare ein: ");
				anzahlExemplare = eingabe.nextInt();
				break;				
			}
			catch (InputMismatchException ex)
			{
				System.out.println("Falsche eingabe!");
				System.out.println("Bitte eine Zahl eingeben!");
			}
			finally
			{
				eingabe.nextLine(); // Zeilenumbruch einlesen
			}
		}			
	}
	
	//	public void ausgeben() {
	//		System.out.println("[Medium] " + titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare);
	//	}
	
	public String toString()
	{
		return titel + " : " + unterTitel + " : " + mediumNummer + " : " + anzahlExemplare;
	}
	
	public int compareTo(Medium medium)
	{
		// die Methode compareToIgnoreCase() ist in der Klasse String
		// implementiert und liefert als Vergleichsergebnis -1, 0 oder 1
		return titel.compareToIgnoreCase(medium.titel);
	}

}
