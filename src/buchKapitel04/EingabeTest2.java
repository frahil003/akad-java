// Datei: EingabeTest2.java
package buchKapitel04;

import java.util.Scanner;

public class EingabeTest2 {
	
	public static void main (String[] args) {
		
		// Erzeugen eines Objektes der Klasse Scanner, um von
		// der Standard-Eingabe (Tastatur) einzulesen.
		Scanner eingabe = new Scanner (System.in);
		
		System.out.print ("Geben Sie Ihren Namen ein: ");
		String name = eingabe.next();
		
		System.out.println ("Hallo " + name + "! Heute wollen wir zwei Zahlen addieren.");
		
		System.out.print (name + ", gib die erste Zahl ein: ");
		int zahl1 = eingabe.nextInt();
		
		System.out.print ("OK. Und nun die zweite Zahl: ");
		int zahl2 = eingabe.nextInt();
		
		System.out.println ("Das Ergebnis ist: " + zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
	}
}