import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		int invers = 0;
		while(numar > 0) {
			int cifra = numar % 10;
			invers = invers * 10 + cifra;
			numar = numar / 10;
		}
		
		System.out.println("Inversul numarului este: " + invers);
	}
}
