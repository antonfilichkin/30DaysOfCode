package ThirtyDaysOfCode.Day14;

import java.util.Arrays;
import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
        maximumDifference = computeDifference();
    }

    public int computeDifference(){
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        for (int value: this.elements) {
            if (value > maxElement) {
                maxElement = value;
            }
            if (value < minElement) {
                minElement = value;
            }
        }
        return maxElement - minElement;
    }

    // End of Difference class
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}