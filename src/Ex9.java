import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti un numar: ");
        int numar = scanner.nextInt();
        
        if(numar == 0 || numar == 1) {
            System.out.println("Numarul trebuie sa fie diferit de 0 sau 1.");
        } else {
            boolean prim = true;
            for(int i = 2; i < numar; i++) {
                if(numar % i == 0) {
                    prim = false;
                    break;
                }
            }
            if(prim) {
                System.out.println("Numarul e prim.");
            } else {
                System.out.println("Numarul nu e prim.");
            }
        }
	}
}
