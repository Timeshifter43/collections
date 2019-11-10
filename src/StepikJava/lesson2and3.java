package StepikJava;

import java.util.Arrays;
import java.lang.System.*;

public class lesson2and3 {
    public static void main(String[] args) {
        int [] firstArr = {0,1,2,4};
        int [] secondArr = {1,3,5,7};

        int result[] = lesson2and3.mergeArrays(firstArr,secondArr);

        for(int i=0; i < result.length; i++){
            System.out.print(result[i] + "");
        }

    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] result = new int [a1.length + a2.length];

        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        Arrays.sort(result);
        return result;
    }

}
