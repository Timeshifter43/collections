import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StepikJava {
    public static void main(String[] args) {
        int result = StepikJava.sum(new int[]{6, 2, 1, 8, 10});

        System.out.println(result);
    }

    public static int sum(int[] numbers)
    {
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        return max;
    }
}