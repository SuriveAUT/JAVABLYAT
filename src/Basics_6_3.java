import java.util.Random;
public class Basics_6_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            int randomNum = random.nextInt(20) + 5;
            intArray[i] = randomNum;
        }
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int num : intArray) {
            if (num < minVal) {
                minVal = num;
            }
            if (num > maxVal) {
                maxVal = num;
            }
        }
        System.out.println("Zufällig generiertes Array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nMinimum: " + minVal);
        System.out.println("Maximum: " + maxVal);
    }
}
