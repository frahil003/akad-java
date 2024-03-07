// Datei: Kreiseck.java
package buchKapitel04;

public class Kreiseck {
	
	private Kreis kreisref;
	private Eck eckref;
	
	// Konstruktor
	public Kreiseck (double alpha) { // alpha ist der Radius des Inkreises
		kreisref = new Kreis(alpha);
		eckref = new Eck(alpha);
	}
	
	public void skaliere (double u) {
		kreisref.skaliere (u);	// Delegationsprinzip. Der Aufruf
		eckref.skaliere (u);	// skaliere(u) wird an die "Klein"-
	}							// Objekte weitergeleitet.
	
	public double flaechendifferenz() {
		return (eckref.berechneFlaeche() - kreisref.berechneFlaeche());
	}
	
	public Kreis getKreis() {
		return kreisref;
	}
}