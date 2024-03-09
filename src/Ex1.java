import java.util.Scanner;

public class Ex1 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți un număr: ");
        int numar = scanner.nextInt();

        
        if (numar < 1 || numar > 10) {
            System.out.println("INVALID");
        } else if (numar > 5) {
            System.out.println("ADMIS");
        } else {
            System.out.println("RESPINS");
        }
    }
}
