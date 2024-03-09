import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int numar = 1001;
		
		while (!estePrim(numar)) {
			numar++;
		}
		
		System.out.println("Cel mai mic numar prim mai mare decat 1000 este: " + numar);
	}
	
	public static boolean estePrim(int numar) {
		if (numar <= 1) {
			return false;
		}
		
		for (int i = 2; i < numar; i++) {
			if (numar % i == 0) {
				return false;
			}
		}
		return true;
	}
}
