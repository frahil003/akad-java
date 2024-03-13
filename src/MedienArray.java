// Datei: MedienArray.java

import entitaeten.Medium;

// generische Klasse, in welcher ein formaler Typparameter T
// verwendet wird
public class MedienArray <T extends Medium>
{
	private Medium[] arr = new Medium[10];
	private int fuellstand = 0;
	
	public void einfuegen(T ref)
	{
		arr[fuellstand++] = ref;
	}
	
	public void ausgeben()
	{
		for (int i = 0; i < fuellstand; i++)
			System.out.println(arr[i]);
	}
}
