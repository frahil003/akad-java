// Datei: TestPunkt2.java
package buchKapitel04;

public class TestPunkt2 {
	
	public static void main (String[] args) {
		
		Punkt2 p1 = new Punkt2(); 	// Erzeugen eines Punktes.
									// x wird durch den selbst
									// geschriebenen parameterlosen
									// Konstruktor auf 1 gesetzt
		
		Punkt2 p2 = new Punkt2(3); // Erzeugen eines Punktes. x wird auf 3 gesetzt
		
		Punkt2 p3 = new Punkt2(10);// Erzeugen eines Punktes. x wird auf 10 gesetzt
		
		System.out.println ("Koordinate des Punktes, auf den p1 zeigt:");
		p1.print();
		
		System.out.println ("Koordinate des Punktes, auf den p2 zeigt:");
		p2.print();
		
		System.out.println ("Koordinate des Punktes, auf den p3 zeigt:");
		p3.print();
	}
}	