package week5;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        double[] temperatures = {2.3, 1.0,-4.2};
        int[] intArray = new int[4];
        System.out.println(Arrays.toString(temperatures));
        System.out.println(Arrays.toString(intArray));
        intArray[2] = 3;
        System.out.println(Arrays.toString(intArray));
    }
}