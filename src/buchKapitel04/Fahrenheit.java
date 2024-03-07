// Datei: Fahrenheit.java

// Klasse zur Wandlung von Temperaturen von Fahrenheit nach Celsius
package buchKapitel04;

public class Fahrenheit	{
	public static void main (String[] args) {
		
		// Konstanten
		final int UPPER = 300;		// obere Grenze
									// UPPER ist eine symbol. Konstante
									// 300 ist eine literale Konstante
		
		final int LOWER = 0;		// untere Grenze
		
		final int STEP = 20;		// Schrittweite
		
		// Variablen
		int fahr;					// Definition der lokalen Variablen
									// fahr für die Temperatur in Fahrenheit
		
		int celsius;				// Definition der lokalen Variablen
									// celsius für die Temperatur in Celsius
		
		// Anweisungen
		fahr = LOWER;				// als Anfangswert wird fahr
									// der Wert 0 zugewiesen
		
		while (fahr <= UPPER) {
			celsius = 5 * (fahr - 32) / 9;	// nach dieser Formel berechnet sich
											// der Celsius-Wert aus einem Fahrenheit-Wert
			
			System.out.print (fahr);		// der Wert von fahr wird auF den Bildschirm ausgegeben
			
			System.out.print (" ");			// Leerzeichen in derselben Zeile
			
			System.out.println (celsius);	// Der Wert von Celsius wird in derselben Zeile ausgegeben.
											// Anschließend springt der Cursor zum Anfang der nächsten Zeile.
			
			fahr = fahr + STEP;		// Der nächste Wert von fahr wird berechnet
		}
	}
}