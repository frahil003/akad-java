// Datei: KreiseckTest.java
package buchKapitel04;

public class KreiseckTest {

	public static void main(String[] args) {
		
		Kreiseck kreiseckref = new Kreiseck(1);
		
		System.out.println ("Radius = " + kreiseckref.getKreis().getRadius());
		
		System.out.println ("Die Flächendifferenz ist " + kreiseckref.flaechendifferenz());
		
		kreiseckref.skaliere(2);
		
		System.out.println ("Es wurde um den Faktor 2 skaliert");
		
		System.out.println ("Radius = " + kreiseckref.getKreis().getRadius());
		
		System.out.println ("Die Flächendifferenz ist " + kreiseckref.flaechendifferenz());
	}
}