package ThirtyDaysOfCode.Day20;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int numsSwaps = 0;
        boolean swapedOnce = false;

        do {
            swapedOnce = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    a[i] = a[i] + a[i + 1];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                    numsSwaps++;
                    swapedOnce = true;
                }
            }

        } while (swapedOnce);


        System.out.println("Array is sorted in " + numsSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);

    }

//    boolean swapElements(int[] array, int index1, int index2){
//        for (int i = 0; i < array.length - 1; i++) {
//            boolean swapedOnce = false;
//            if (array[i] > array[i + 1]) {
//                array[i] = array[i] + array[i + 1];
//                array[i + 1] = array[i] - array[i + 1];
//                array[i] = array[i] - array[i + 1];
//                swapedOnce = true;
//            }
//        }
//
//    }


}


