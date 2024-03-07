// Datei: Fahrenheit4.java
package buchKapitel04;

public class Fahrenheit4 {
	// Klassenmethode main() zur Ausgabe der Temperaturtabelle
	public static void main (String[] args) {
		
		// Konstanten
		final int UPPER = 300; 
		final int LOWER = 0; 
		final int STEP = 10; 
		
		// Variablen
		int fahr;	
		int celsius; 
		
		// Anweisungen
		fahr = LOWER;	// als Anfangswert wird fahr der Wert 0 zugewiesen
		
		while (fahr <= UPPER) {
			// nach dieser Formel berechnet sich der Celsius-Wert aus
			// einem Fahrenheit-Wert
			celsius = 5 * (fahr - 32) / 9;
			
			// die Werte von fahr und celsius werden jeweils rechtsbün-
			// dig in einem 3 Zeichen breiten Feld ausgegeben
			System.out.printf ("%3d ---> %3d\n", fahr, celsius);
			
			fahr = fahr + STEP; // nächsten Wert von fahr berechnen
		}
	}
}