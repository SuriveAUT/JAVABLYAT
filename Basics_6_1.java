import java.util.Arrays;

public class Basics_6_1 {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 1, 2, 7 ,5};
        Arrays.sort(numbers);
        int[] result = filterDuplicates(numbers);

        System.out.println(Arrays.toString(result));
    }

    public static int[] filterDuplicates(int[] numbers) {

        int[] eindeutig = new int[numbers.length];
        int laengearray = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                eindeutig[laengearray] = numbers[i];
                laengearray++;
            }
        }

        eindeutig[laengearray] = numbers[numbers.length - 1];

        int[] result = Arrays.copyOf(eindeutig, laengearray + 1);

        return result;
    }
}
