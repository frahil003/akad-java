// Datei: Punkt4.java
package buchKapitel04;

public class Punkt4 {
	
	private int x; // Datenfeld für die x-Koordinate vom Typ int
	private int y; // Datenfeld für die y-Koordinate vom Typ int
	
	public int getX() {	// eine Methode, um den x-Wert abzuholen
		return x;
	}
	
	public int getY() {	// eine Methode, um den y-Wert abzuholen
		return y;
	}
	
	public void setX (int i) { // eine Methode, um den x-Wert zu setzen
		x = i;
	}
	
	public void setY (int i) { // eine Methode, um den y-Wert zu setzen
		y = i;
	}
	
	public void verschiebe(int deltaX, int deltaY) {
		x = x + deltaX;
		y = y + deltaY;
	}
}