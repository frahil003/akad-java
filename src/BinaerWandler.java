
public class BinaerWandler {

	public static void main(String[] args) {
		
		int zahl = 3;
		int zahlAusgabe = zahl;
		
		String binaer = "";
		
		// Variable, die den Rest der Division durch 2 speichert
		int rest;
		do {
			// Der Rest kann immer nur 1 oder 0 sein.
			rest = zahl % 2;
			zahl = zahl / 2;
			
			// Zusammensetzen des Strings zur Binärdarstellung
			binaer = rest + binaer;
			
		} while (zahl > 0);
		
		System.out.println (zahlAusgabe + " dezimal ist: " + binaer + " binär");
	}
}