// Datei: Punkt4Test.java
package buchKapitel04;

public class Punkt4Test {

	public static void main(String[] args) {
		
	Punkt4 p = new Punkt4();	// Hiermit wird der Punkt erzeugt
	
	p.setX(1);	// Aufruf der Methode setX()
	p.setY(2);	// Aufruf der Methode setY()
	
	System.out.println("Die Koordinaten des Punktes vor der Verschiebung sind: ");
	System.out.println("X-Wert: " + p.getX());
	System.out.println("Y-Wert: " + p.getY());
	
	p.verschiebe(4, 1);
	
	System.out.println();
	System.out.println("Die Koordinaten des Punktes nach der Verschiebung sind: ");
	System.out.println("X-Wert(neu): " + p.getX());
	System.out.println("Y-Wert(neu): " + p.getY());
	}
}