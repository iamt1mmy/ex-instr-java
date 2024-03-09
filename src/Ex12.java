import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
		int n = scanner.nextInt();
		
		System.out.println("Divizorii primi ai numarului " + n + " sunt: ");
		for(int i = 2; i <= n; i++) {
			if(n % i == 0 && prim(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean prim(int numar) {
		if(numar <= 1) {
			return false;
		}
		for(int i = 2; i * i <= numar; i++) {
			if(numar % i == 0) {
				return false;
			}
		}
		return true;
	}
}
