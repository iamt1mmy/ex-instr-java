import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti primul numar: ");
		int numar1 = scanner.nextInt();
		System.out.println("Introduceti al doilea numar: ");
		int numar2 = scanner.nextInt();
		System.out.println("Introduceti al treilea numar: ");
		int numar3 = scanner.nextInt();
		
		int minim = numar1;
		if(numar2 < minim) {
			minim = numar2;
		}
		if(numar3 < minim) {
			minim = numar3;
		}
		
		System.out.println("Valoarea minima este: " + minim);
	}
}
