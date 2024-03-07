// Datei: Kreis.java
package buchKapitel04;

public class Kreis {
	private double radius;
	static final double PI = 3.1415; // PI ist eine konstante Klassenvariable
	
	public Kreis (double u) {
		radius = u;
	}
	
	public void skaliere (double u) {
		radius = radius * u;
	}
	
	public double berechneFlaeche() {
		return (PI * radius * radius);
	}
	
	public double getRadius() {
		return radius;
	}
}