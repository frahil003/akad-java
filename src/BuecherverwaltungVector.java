// Datei: Buecherverwaltung.java

import entitaeten.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class BuecherverwaltungVector {
	
	private Vector<Buch> arr = new Vector<Buch>();
	
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
				arr.add(new Buch(eingabe));
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
		Collections.sort(arr);
		for (Buch element : arr)
			System.out.println(element);		
	}
	
	public static void main(String args[])
	{
		Buecherverwaltung bibliothek = new Buecherverwaltung();
		bibliothek.auswahlAnzeigen();
	}
}
