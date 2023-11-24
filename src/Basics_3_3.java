import java.util.Scanner;

public class Basics_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        String[] getrennt = name.split(" ");
        if (getrennt.length == 3) {
            String first = getrennt[0];
            String tmp = getrennt[1];
            String[] tmp2 = tmp.split("");
            String middle = tmp2[0];
            String last = getrennt[2];
            System.out.println(last + ", " + first + " " + middle + ".");

        } else {
            System.out.println("fehler");
        }
    }
}