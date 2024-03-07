// Datei: TestBestandsausgabe.java

import entitaeten.*;

public class TestBestandsausgabe {

	public static void main(String[] args) {
		
		Ausgebbar ref1 = new Buch("Java als erste Programmiersprache", "Vom Einsteiger zum Profi", "978-3-8348-0656-7", 5);
        
		Ausgebbar ref2 = new Zeitschrift("Informatik Spektrum", "Java Modeling Language", "0170-6012", 2, 1988);
		
		// Programmcode für die Bestandsausgabe
		ref1.ausgeben();
		ref2.ausgeben();
	}
}