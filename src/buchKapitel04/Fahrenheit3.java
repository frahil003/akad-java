// Datei: Fahrenheit3.java
package buchKapitel04;

public class Fahrenheit3 {

	public static void main(String[] args) {
		
		// Konstanten
		final int UPPER = 300;
		final int LOWER = 0;
		final int STEP = 20;
		
		int fahr;
		float celsius;
				
		fahr = LOWER;
		
		while(fahr<= UPPER) {
			
			celsius = (float) (5.0 / 9) * (fahr -32);
			
			System.out.println(fahr + "     " + celsius);
			
			fahr = fahr + STEP;
		}
	}
}
