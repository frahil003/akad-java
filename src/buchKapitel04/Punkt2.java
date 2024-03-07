// Datei Punkt2.java
package buchKapitel04;

public class Punkt2 {

	private int x;
	
	// Dieser Konstruktor wird noch erklärt
	public Punkt2() { 
		System.out.print("selbst geschriebener ");
		System.out.print("parameterloser Konstruktor:");
		x = 1;
		System.out.println("x = " + x);
	}
	
	// Dieser Konstruktor wird noch erklärt
	public Punkt2 (int u) {
		System.out.print("Konstruktor mit einem Parameter:");
		System.out.println(" x = " + u);
		x = u;
	}
	
	public void print() {
		System.out.println("x = " + x);
	}
}