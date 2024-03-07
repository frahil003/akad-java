
public class ForEachTest {

	public static void main(String[] args) {
		
		String[] testArray = new String[] {"Hallo", "for-each", "Schleife"};
		
		// Array mit Hilfe der erweiterten for-Schleife auslesen.
		int i = 0;
		for (String element : testArray)
		{
			if (i == 2) break;			
			// Zugriff auf das Element des Arrays
			System.out.println (element);
			i++;			
		}
	}
}