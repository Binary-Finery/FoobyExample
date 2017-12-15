package spencerstudios.com.fooby;

import java.util.Arrays;

public class Fooby {

    public static int sum(int[] arr) {
        int t = 0;
        for (int i : arr) t = t + i;
        return t;
    }

    public static int high(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int low(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static double average(int[] arr) {
        int t = 0;
        for (int i : arr) t = t + i;
        return (double) t / arr.length;
    }
}
