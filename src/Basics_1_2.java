import java.util.Scanner;

public class Basics_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zu zahlen: ");
        double zahlen = scanner.nextDouble();
        System.out.println("erhalten: ");
        double erhalten = scanner.nextDouble();
        System.out.println("Rückgeld: ");
        double ergebnis = erhalten - zahlen;
        System.out.println(String.format("%.2f", ergebnis) + "€");
    }
}

