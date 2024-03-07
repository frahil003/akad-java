package buchKapitel04;

public class Fahrenheit2 {

	public static void main(String[] args) {
		
		int fahr;
		
		for (fahr = 0; fahr <= 300; fahr = fahr + 20) {
			System.out.print(fahr);
			System.out.print("     ");
			System.out.println(5 * (fahr-32) / 9);
		}
	}
}