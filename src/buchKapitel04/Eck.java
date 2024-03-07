// Datei: Eck.java
package buchKapitel04;

public class Eck {
	private Punkt5 p1;
	private Punkt5 p2;
	private Punkt5 p3;
	private Punkt5 p4;
	
	public Eck (double u) { // u soll eine halbe Seitenlänge des Quadrats darstellen
		
		System.out.println ("Viereck wird erzeugt aus 4 Eckpunkten");
		
		p1 = new Punkt5 (u, u);
		p2 = new Punkt5 (-u, u);
		p3 = new Punkt5 (u, -u);
		p4 = new Punkt5 (-u, -u);
		}
	
	public void skaliere (double u) {
		p1.setX (p1.getX() * u);
		p1.setY (p1.getY() * u);
		
		p2.setX (p2.getX() * u);
		p2.setY (p2.getY() * u);
		
		p3.setX (p3.getX() * u);
		p3.setY (p3.getY() * u);
		
		p4.setX (p4.getX() * u);
		p4.setY (p4.getY() * u);
	}
	
	public double berechneFlaeche() {
		return (2 * p1.getX()) * (2 * p1.getY());
	}
}