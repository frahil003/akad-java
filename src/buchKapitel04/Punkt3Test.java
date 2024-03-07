// Datei: Punkt3Test.java
package buchKapitel04;

public class Punkt3Test {

	public static void main(String[] args) {
		
	Punkt3 p = new Punkt3();	// Hiermit wird der Punkt erzeugt
	
	p.setX(1);	// Aufruf der Methode setX()
	p.setY(2);	// Aufruf der Methode setY()
	
	System.out.println("Die Koordinaten des Punktes sind: ");
	System.out.println("X-Wert: " + p.getX());
	System.out.println("Y-Wert: " + p.getY());
	}
}