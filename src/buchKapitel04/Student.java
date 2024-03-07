// Datei: Student.java
package buchKapitel04;

public class Student extends Person2 {
	
	private String matrikelnummer;
	
	public Student() {
		super(); // Aufruf des Konstruktors der Vaterklasse
		
		System.out.print ("Matrikelnummer eingeben ");
		System.out.print ("(Ende mit <CR>): ");
		
		matrikelnummer = input();
	}
	
	public void printMatrikelnummer() {
		System.out.print ("\nMatrikelnummer : " + matrikelnummer);
	}
	
	public static void main (String[] args) {
		
		System.out.print ("\nErfasse Person");
		Person2 pers1 = new Person2();
		
		System.out.print ("\nErfasse Student");
		Student stud1 = new Student();
		
		System.out.print ("\nAusgabe Person");
		pers1.print();
		
		System.out.print ("\n\nAusgabe Student");
		stud1.print();
		stud1.printMatrikelnummer();
	}
}