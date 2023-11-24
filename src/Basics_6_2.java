import java.util.Arrays;

public class Basics_6_2 {
    public static void main(String[] args) {
        int[] numbers1 = {2, 2, 1};
        Arrays.sort(numbers1);
        int[] numbers2 = {2, 3, 1};
        Arrays.sort(numbers2);
        int[] result = concatArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] concatArrays(int[] numbers1, int[] numbers2) {
        int[] mergedArray = new int[numbers1.length + numbers2.length];
        int index = 0;
        int i = 0, j = 0;

        while (i < numbers1.length && j < numbers2.length) {
            if (numbers1[i] < numbers2[j]) {
                mergedArray[index] = numbers1[i];
                i++;
            } else if (numbers1[i] > numbers2[j]) {
                mergedArray[index] = numbers2[j];
                j++;
            } else {
                mergedArray[index] = numbers1[i];
                i++;
                j++;
            }
            index++;
        }

        while (i < numbers1.length) {
            mergedArray[index] = numbers1[i];
            i++;
            index++;
        }

        while (j < numbers2.length) {
            mergedArray[index] = numbers2[j];
            j++;
            index++;
        }

        return Arrays.copyOf(mergedArray, index);
    }
}
