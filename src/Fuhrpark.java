// Datei: Fuhrpark.java

import java.util.Vector;

public class Fuhrpark {

	private Vector<Fahrzeug> fahrzeuge = new Vector<Fahrzeug>();
	
	public void aufnehmen(Fahrzeug ref)
	{
		fahrzeuge.add(ref);
	}
	
	public void ausbuchen(Fahrzeug ref)
	{
		fahrzeuge.remove(ref);
	}
	
	public void ausgeben()
	{
		int anzahl = fahrzeuge.size();
		for (int i = 0; i < anzahl; i++)
		{
			Fahrzeug ref = fahrzeuge.get(i);
			System.out.println(ref); // Aufruf toString()-Methode
		}
	}
}