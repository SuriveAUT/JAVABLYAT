import java.util.Scanner;

public class Basics_5_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wort einsetzen: ");
        String word = scanner.nextLine();
        System.out.println("Buchstabe einsetzen: ");
        char buchstabe = scanner.nextLine().charAt(0);
        System.out.println(count_letters(word, buchstabe));
    }

    public static int count_letters(String Word, char Letter) {
        // for(int i = start; bedingung; update) for(int i = 3; i < 10; i++)
        char[] chararray = Word.toCharArray();
        int anz = 0;
        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i] == Letter) {
                anz += 1;
            }
        }
        return anz;
    }
}




