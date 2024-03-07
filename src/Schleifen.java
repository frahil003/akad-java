
public class Schleifen {
	
	public static void main(String[] args) {
		
		//Dieses Beispiel funktioniert
		int i = 0;
		int j = 0;
		
		
		for (i = 0, j = 1; j >= 0; i++, j--) //Liste von Ausdrücken
		{
			System.out.println ("i: " + i);
			System.out.println ("j: " + j);
		}
		
		// Dieses Beispiel funktioniert auch
		for (int k = 0, l = 1; l >= 0; k++, l--)
		{
			System.out.println ("k: " + k);
			System.out.println ("l: " + l);
		}
		
		// Dieses Beispiel funktioniert nicht.
		// Es ist nur eine Liste von Ausdrücken zulässig, nicht
		// aber eine Liste von Definitionen von Laufvariablen.
		// for (int m = 0, int n = 2; n >= 0; m++, n--)
		// {
		// System.out.println ("m: " + m);
		// System.out.println ("n: " + n);
		// }
	}
}