import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		int invers = 0;
		int copie = numar;
		while(copie > 0) {
			int cifra = copie % 10;
			invers = invers * 10 + cifra;
			copie = copie / 10;
		}
		
		if(numar == invers) {
			System.out.println("Numarul " + numar + " este palindrom.");
		} else {
			System.out.println("Numarul " + numar + " nu este palindrom.");
		}
	}
}
