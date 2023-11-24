import java.util.Scanner;

public class Basics_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Monat, Jahr: ");
        String monyea = scanner.nextLine();
        String[] getr = monyea.split(" ");
        String mon = getr[0];
        int ja = Integer.parseInt(getr[1]);

        if (getr.length == 2) {
            int day = switch (mon) {
                case "Jänner", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
                case "April", "Juni", "September", "November" -> 30;
                case "Februar" -> {
                    if (ja % 400 == 0 || ja % 4 == 0 && ja % 100 != 0) {
                        yield 29;
                    } else {
                        yield 28;
                    }
                }

                default -> throw new IllegalStateException("Unexpected value: " + mon);
            };

            System.out.println("Der Monat hat " + day + " Tage");

        } else {
            System.out.println("Fehler");
        }
    }

}
