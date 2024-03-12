// Datei: TestBestandsausgabe.java

import entitaeten.*;

public class TestBestandsausgabe {

	public static void main(String[] args) {
		
		Medium[] arr = new Medium[3];
		
		// Konstruktor mit 4 Parametern der Klasse Buch
		arr[0] = new Buch("Java als erste Programmiersprache", "Vom Einsteiger zum Profi", "978-3-8348-0656-7", 5);
		// Konstruktor mit 3 Parametern der Klasse Buch
		arr[1] = new Buch("JAVA", "kurz & gut", "978-3-8274-1937-8", 5);
		// Konstruktor mit 3 Parametern der Klasse Zeitschrift
        arr[2] = new Zeitschrift("Informatik Spektrum", "Java Modeling Language", "0170-6012", 2);
		
		System.out.println("Anzahl verschiedener Medien: " + (Buch.getBestand() + Zeitschrift.getbestand()));
		
        // Programmcode für die Bestandsausgabe
		//for(int i = 0; i < arr.length; i++) {
		//	arr[i].ausgeben();
		//}
				//System.out.println();
		
		// Ausgabe mit der for-each-Schleife
		for (Medium ref : arr) {
			System.out.println(ref);
		}
	}
}