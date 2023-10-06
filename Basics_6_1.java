import java.util.Arrays;

public class Basics_6_1 {
    public static void main(String[] args) {
    int[] unsorted = {1, 2, 3, 4, 5, 4, 3, 2, 1,1 ,2 ,3};
    Arrays.sort(unsorted);
    }
    public static int filterduplicates(int[] numbers) {
    int anz = 0;
        for(int i = 0; i < numbers.length; i++){

        int i2 = i+=1;
        if(numbers[i] == numbers[i2]){
            anz+=1;
        }
        }
    }
}
