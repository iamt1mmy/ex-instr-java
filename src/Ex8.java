import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		long factorial = 1;
		for(int i = 1; i <= numar; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorialul numarului " + numar + " este: " + factorial);
	}
}
