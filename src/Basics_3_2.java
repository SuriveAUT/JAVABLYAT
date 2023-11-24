import java.util.Scanner;

public class Basics_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLZ: ");
        if (scanner.hasNextInt()) {
            int plz = scanner.nextInt();
            int tmp = plz / 1000;
            int bezirk = (plz % 1000) / 10;
            if (bezirk > 0 && bezirk < 24 && tmp == 1) {
                System.out.println(bezirk + ". Bezirk");
            } else {
                System.out.println("Fehler");
            }
        } else {
            System.out.println("Fehler");
        }

    }
}
