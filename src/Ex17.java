import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		int cifmax = 0;
		while(numar > 0) {
			int cifra = numar % 10;
			if(cifra > cifmax) {
				cifmax = cifra;
			}
			numar = numar / 10;
		}
		
		System.out.println("Cifra maxima a numarului este: " + cifmax);
	}
}
