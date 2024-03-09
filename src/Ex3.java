import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti primul numar: ");
		int numar1 = scanner.nextInt();
		System.out.println("Introduceti al doilea numar: ");
		int numar2 = scanner.nextInt();
		
		if(numar1 % 2 == 0 && numar2 % 2 == 0) {
			System.out.println("Media aritmetica este: " + (numar1 + numar2) / 2);
		} else if(numar1 % 2 != 0 && numar2 % 2 != 0) {
			System.out.println("Produsul numerelor este: " + numar1 * numar2);
		} else {
			System.out.println("Suma numerelor este: " + (numar1 + numar2));
		}
	}
}
