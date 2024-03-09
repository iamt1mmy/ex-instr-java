import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		int cifmin = 9;
		while(numar > 0) {
			int cifra = numar % 10;
			if(cifra < cifmin) {
				cifmin = cifra;
			}
			numar = numar / 10;
		}
		
		System.out.println("Cifra minima a numarului este: " + cifmin);
	}
}
