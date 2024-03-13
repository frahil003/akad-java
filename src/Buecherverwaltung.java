// Datei: Buecherverwaltung.java

import entitaeten.*;
import java.util.Scanner;

public class Buecherverwaltung {
	
	private Buch[] arr = new Buch[100];
	
	public void auswahlAnzeigen()
	{
		System.out.println("\nAuswahlmenü:");
		System.out.println("<1> Buch anlegen");
		System.out.println("<2> Bestand ausgeben");
		System.out.println("<3> Beenden");
		System.out.print("\nBitte Zahl eingeben und mit RETURN bestätigen:");
		auswahlAuswerten();
	}
	
	private void auswahlAuswerten()
	{
		Scanner eingabe = new Scanner(System.in);
		int auswahl = eingabe.nextInt();
		eingabe.nextLine(); // Zeilenumbruch einlesen
		
		switch(auswahl)
		{
			case 1:
			{
				arr[Buch.getBestand()] = new Buch(eingabe);
				auswahlAnzeigen();
				break;			
			}
			case 2:
			{
				bestandAusgeben();
				auswahlAnzeigen();
				break;
			}
			case 3:
				System.out.println("Programm BEENDET!!!");
				break;
			default:
				System.out.println("Falsche Eingabe");
		}
	}
	
	private void bestandAusgeben()
	{
		for(int i = 0; i < Buch.getBestand(); i++)
			System.out.println(arr[i]);
	}
	
	public static void clearScreen() {
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	}
	
	public static void main(String args[])
	{
		Buecherverwaltung bibliothek = new Buecherverwaltung();
		bibliothek.auswahlAnzeigen();
	}
}
