package ThirtyDaysOfCode.Day6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        String[] arrayOfStrings = new String[numberOfTests];
        scanner.nextLine();

        for (int i = 0; i < numberOfTests; i++) {
            arrayOfStrings[i] = scanner.nextLine();
        }

        scanner.close();

        for (String value : arrayOfStrings) {
            String out1 = "";
            String out2 = "";
            for (int i = 0; i < value.length(); i++) {
                if (i % 2 == 0) {
                    out1 += value.charAt(i);
                } else {
                    out2 += value.charAt(i);
                }
            }
            System.out.println(out1 + " " + out2);
        }
    }
}
