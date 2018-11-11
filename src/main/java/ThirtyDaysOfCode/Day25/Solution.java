package ThirtyDaysOfCode.Day25;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < tests; i++){
            BigInteger number = new BigInteger(scanner.nextLine());

//            boolean isPrime = number.isProbablePrime(1);
//            if (number == 1) {
//                isPrime = false;
//            } else {
//                for (int j = 2; j < number; j++){
//                    if (number%j == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//            }
//
//            System.out.println(isPrime ? "Prime" : "Not prime");
            System.out.println(number.isProbablePrime(1) ? "Prime" : "Not prime");

        }

        scanner.close();
    }
}