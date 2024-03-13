import java.util.Vector;

import entitaeten.Buch;

import java.util.Collections;

public class FruitsSortieren {
	
	
	public static void main(String[] args)
	{
		
		Vector<String> fruechte = new Vector<String>();
				
		fruechte.add("Orange");
		fruechte.add("Banana");
		fruechte.add("Grape");
		fruechte.add("Apple");
		
		System.out.println(fruechte);
		
		Collections.sort(fruechte);
		System.out.println(fruechte);
		System.out.println("------------------------------------");
		
		
		
		Vector<fruits> fruitList = new Vector<fruits>();
		fruits fruit1 = new fruits("Orange", 10);
		fruits fruit2 = new fruits("Banane", 5);
		fruits fruit3 = new fruits("Zitrone", 23);
		fruits fruit4 = new fruits("Apfel", 14);

		fruitList.add(fruit1);
		fruitList.add(fruit2);
		fruitList.add(fruit3);
		fruitList.add(fruit4);		
		
		Collections.sort(fruitList);
		for (fruits element : fruitList)
			System.out.println(element);
		
	
		

	}

}
