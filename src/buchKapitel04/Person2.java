// Datei: Person2.java
package buchKapitel04;

import java.util.Scanner;

public class Person2 {
	private String name; 	// Namen sind konstante Zeichenketten
	private String vorname;	// und können in einer Variable vom
							// Typ String gespeichert werden. Die
							// Klasse String ist eine Bibliotheks-
							// klasse
	public Person2() {
		System.out.print("\nNachnamen eingeben ");
		System.out.print("(Ende mit <ENTER>): ");
		name = input();
		
		System.out.print("Vornamen eingeben ");
		System.out.print("(Ende mit <ENTER>): ");
		vorname = input();
	}
	
	public String input() {	// bitte überlesen Sie diese Methode
		Scanner eingabe = new Scanner(System.in);
		return eingabe.next();
	}
	
	public void print() {
		System.out.print ("\nNachname: " + name);
		System.out.print ("\nVorname: " + vorname);
	}
}