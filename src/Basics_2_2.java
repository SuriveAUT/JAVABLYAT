import java.util.Scanner;

public class Basics_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Celsius: ");
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();
            if (celsius > -273.15) {
                double fahrenheit = 9 * celsius / 5 + 32;
                double kelvin = celsius + 273.15;
                System.out.println(String.format("Fahrenheit: %.2f", fahrenheit));
                System.out.println(String.format("Kelvin: %.2f", kelvin));
            } else {
                System.out.println("Fehler");
            }
        } else {
            System.out.println("Fehler");
        }

    }
}
