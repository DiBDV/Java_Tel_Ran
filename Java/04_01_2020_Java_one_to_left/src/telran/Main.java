package telran;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] integers = {5,7,10,12,25,30,47};
        oneToLeft(integers);
        System.out.println(Arrays.toString(integers));

    }

    public static int[] oneToLeft (int[] integers){
        int temp = integers[0];
        for (int i = 1; i < integers.length ; i++) {
            integers[i - 1] = integers[i];
        }
        integers[integers.length-1] = temp;
        return integers;
    }
}
