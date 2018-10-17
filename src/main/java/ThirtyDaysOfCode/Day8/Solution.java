package ThirtyDaysOfCode.Day8;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        String binary = Integer.toBinaryString(n);
        int max1sequence = 0;
        int temp1sequence = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                temp1sequence++;
            } else {
                max1sequence = Math.max(temp1sequence, max1sequence);
                temp1sequence = 0;
            }
        }

        System.out.println(Math.max(temp1sequence, max1sequence));

    }
}
