// Datei: Zeichen.java
package buchKapitel04;

public class Zeichen {
	
	// beachten Sie die Deklaration der Methode main() nicht
	public static void main(String[] args) throws Exception {
		
		int c = 0;
		int anzahl = 0;
		
		System.out.print   ("Bitte eine Folge von Zeichen eingeben ");
		System.out.println ("und mit <RETURN> abschliessen");
		
		do {
			// System.in.read() gibt einen int-Wert im Bereich 0 bis
			// 255 zurück. -1 wird zurückgegeben, wenn kein Zeichen
			// mehr im Dateipuffer steht.
		
			c = System.in.read();
		
			// Mit (char) c wird die int-Variable c in ein Zeichen gewandelt.
			System.out.println ("ASCII-Code: " + c + " Zeichen: " + (char) c);
			
			anzahl = anzahl + 1;
			
		} while (c != -1);
			
		System.out.println ("Anzahl: " + anzahl);		
	}
}