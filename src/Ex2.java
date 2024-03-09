import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți un număr între 1 și 5: ");
        int numar = scanner.nextInt();

        if (numar >= 1 && numar <= 5) {
            String numarInLitere = convertesteNumarInLitere(numar);
            System.out.println(numarInLitere);
        } else {
            System.out.println("INVALID");
        }
    }

    public static String convertesteNumarInLitere(int numar) {
        switch (numar) {
            case 1:
                return "UNU";
            case 2:
                return "DOI";
            case 3:
                return "TREI";
            case 4:
                return "PATRU";
            case 5:
                return "CINCI";
            default:
                return "INVALID";
        }
    }
}
