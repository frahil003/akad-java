// Datei: TestBestandsausgabeArr.java

import entitaeten.*;

public class TestBestandsausgabeArr {

	public static void main(String[] args) {
		
		System.out.println("Anzahl verschiedener Medien: " + (Buch.getBestand() + Zeitschrift.getbestand()));
		
		Ausgebbar[] arr = new Ausgebbar [3];
		
		arr[0] = new Buch("Java als erste Programmiersprache", "Vom Einsteiger zum Profi", "978-3-8348-0656-7", 5);
		// konstruktor mit 3 Parametern der Klasse Buch
		arr[1] = new Buch("IT-Projektmanagement kompakt", "978-3-8274-1937-8", 3);
		// Konstruktor mit 4 Parametern der Klasse Zeitchrift
        arr[2] = new Zeitschrift("Informatik Spektrum", "0170-6012", 2, 1988);
		
		System.out.println("Anzahl verschiedener Medien: " + (Buch.getBestand() + Zeitschrift.getbestand()));
		
        // Programmcode für die Bestandsausgabe
		//for(int i = 0; i < arr.length; i++) {
		//	arr[i].ausgeben();
		//}
				//System.out.println();
		
		// Ausgabe mit der for-each-Schleife
		for (Ausgebbar element : arr) {
			element.ausgeben();
			System.out.println();
		}
	}
}