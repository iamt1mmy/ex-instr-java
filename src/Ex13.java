
public class Ex13 {

	public static void main(String[] args) {
		System.out.println("Perechile de numere a caror suma este 1000, primul divizibil cu 17 si al doilea cu 19, sunt: ");
		for(int i = 0; i <= 1000; i++) {
			if(i % 17 == 0) {
				int j = 1000 - i;
				if(j % 19 == 0) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}
}
