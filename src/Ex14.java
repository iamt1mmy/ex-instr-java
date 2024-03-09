
public class Ex14 {

	public static void main(String[] args) {
		System.out.println("Perechile de numere a caror suma este 1000, primul divizibil cu 17 sau 13 si al doilea cu 19 sau 7, sunt: ");
		for(int i = 0; i <= 1000; i++) {
			if(i % 17 == 0 || i % 13 == 0) {
				int j = 1000 - i;
				if(j % 19 == 0 || j % 7 == 0) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}
}
