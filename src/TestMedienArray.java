// Datei: TestMedienArray.java

import entitaeten.*;

public class TestMedienArray {

	public static void main(String[] args) {
		Buch buch1 = new Buch("Lehrbuch der SW-Technik", "SW-Management", "123-456-678", 5);
		Buch buch2 = new Buch("Java", "kurz und gut", "987-654-321", 3);
		Zeitschrift z1 = new Zeitschrift("Informatik Spektrum", "Jave Modeling Language", "222-333-444-555", 2);
		
		System.out.println("Nur Bücher erlaubt:");
		// aktueller Typparmeter Buch verwenden:
		MedienArray<Buch> buchArr = new MedienArray<Buch>();
		buchArr.einfuegen(buch1);
		buchArr.einfuegen(buch2);
		// buchArr.einfuegen (z1); Geht nicht!
		buchArr.ausgeben();
	
		System.out.println("\nNur Zeitschriften erlaubt:");
		// aktueller Typparameter Zeitschrift verwenden:
		MedienArray<Zeitschrift> zArr = new MedienArray<Zeitschrift>();
		zArr.einfuegen(z1);
		// zArr.einfuegen(buch1); geht nicht!
		zArr.ausgeben();
		
		System.out.println("\nBücher und Zeitschriften erlaubt:");
		// aktueller Typparameter Medium verwenden:
		MedienArray<Medium> mArr = new MedienArray<Medium>();
		mArr.einfuegen(buch1);
		mArr.einfuegen(buch2);
		mArr.einfuegen(z1);
		mArr.ausgeben();		
	}
}
