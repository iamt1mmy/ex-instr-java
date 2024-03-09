import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int numar = scanner.nextInt();
		
		System.out.println("Divizorii numarului " + numar + " sunt: ");
		for(int i = 1; i <= numar; i++) {
			if(numar % i == 0) {
				System.out.println(i);
			}
		}
	}
}
