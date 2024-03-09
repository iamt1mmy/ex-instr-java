import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti numarul de elemente: ");
		int n = scanner.nextInt();
		
		int suma = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Introduceti numarul " + (i+1) + ": ");
			int numar = scanner.nextInt();
			suma = suma + numar;
		}
		
		double media = (double) suma / n;
		System.out.println("Media aritmetica a numerelor este: " + media);
	}
}
