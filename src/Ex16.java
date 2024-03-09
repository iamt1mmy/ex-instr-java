import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		System.out.println("Cifrele numarului " + numar + " sunt: ");
		while(numar > 0) {
			int cifra = numar % 10;
			System.out.println(cifra);
			numar = numar / 10;
		}
	}
}
