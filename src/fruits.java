import entitaeten.Medium;

public class fruits implements Comparable<Object>{
	
	private String name;
	private int anzahl;
	
	public fruits (String name, int anzahl)
	{
		this.name = name;
		this.anzahl = anzahl;
	}
	
	public String toString()
	{
		return name + " Anzahl: " + anzahl;
	}
	
//	@Override 
//    public int compareTo(Object o) {
//		fruits f = (fruits) o; 
//        return this.anzahl - f.anzahl ;
//    }
	
	public int compareTo(Object fruits)
	{
		// die Methode compareToIgnoreCase() ist in der Klasse
		// String implementiert und liefert als Vergleichsergebnis
		// -1, 0 oder 1
		return name.compareToIgnoreCase(fruits.toString());
	}
}
