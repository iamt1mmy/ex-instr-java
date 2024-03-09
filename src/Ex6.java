import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		int suma = 0;
		for(int i = 0; i < numar; i++) {
			suma = suma + (2 * i + 1);
		}
		
		System.out.println("Suma primelor " + numar + " numere impare este: " + suma);
	}
}
