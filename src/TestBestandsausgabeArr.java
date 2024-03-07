// Datei: TestBestandsausgabeArr.java

import entitaeten.*;

public class TestBestandsausgabeArr {

	public static void main(String[] args) {
		
		Ausgebbar[] arr = new Ausgebbar [3];
		
		arr[0] = new Buch("Java als erste Programmiersprache", "Vom Einsteiger zum Profi", "978-3-8348-0656-7", 5);
		arr[1] = new Buch("IT-Projektmanagement kompakt", "i", "978-3-8274-1937-8", 3);
        arr[2] = new Zeitschrift("Informatik Spektrum", "Java Modeling Language", "0170-6012", 2, 1988);
		
		// Programmcode für die Bestandsausgabe
		for(int i = 0; i < arr.length; i++) {
			arr[i].ausgeben();
		}
		
		System.out.println();
		
		// Ausgabe mit der for-each-Schleife
		for (Ausgebbar element : arr) {
			element.ausgeben();
		}
	}
}