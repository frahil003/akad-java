// Datei: Buecherverwaltung.java

import entitaeten.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.io.*;

public class BuecherverwaltungIO {
	
	private Vector<Buch> arr = new Vector<Buch>();
	
	// Konstruktor zum Einlesen des Bestands aus einer Datei
	public BuecherverwaltungIO(String dateiName) throws Exception
	{
		File file = new File(dateiName);
		{
			FileInputStream fis = new FileInputStream(dateiName);
			Scanner scan = new Scanner(fis);
			// Als Trenner soll das Zeiche : verwendet werden
			scan.useDelimiter("\\s*:\\s*");
			
			while (scan.hasNext())
			{
				scan.next();	// [Buch] einlesen und verwerfen
				arr.add(new Buch(scan.next(), scan.next(), scan.next(), scan.nextInt()));
			}
			fis.close();
		}		
	}
	
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
	
	public void bestandSpeichern(String dateiName) throws Exception
	{
		PrintStream out = new PrintStream (new FileOutputStream(dateiName));
		for (Buch element : arr)
			out.println(element + " :");
		out.close();
	}
	
	public static void main(String args[]) throws Exception
	{
		if (args.length == 1)
		{
			BuecherverwaltungIO bibliothek =  new BuecherverwaltungIO (args[0]);
			bibliothek.auswahlAnzeigen();
			// Bestand speichern
			bibliothek.bestandSpeichern(args[0]);
		}
		else
		{
			System.out.println("Aufruf mit: " + "java Bücherverwaltung Dateiname.txt");
		}
	}
}
