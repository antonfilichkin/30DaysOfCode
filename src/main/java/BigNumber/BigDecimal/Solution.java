package BigNumber.BigDecimal;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

//        boolean isSorted;
//        do {
//            isSorted = true;
//            for (int i = 0; i < n - 1; i++) {
//                if (new BigDecimal(s[i]).compareTo(new BigDecimal(s[i + 1])) < 0) {
//                    String tmp = s[i];
//                    s[i] = s[i + 1];
//                    s[i + 1] = tmp;
//                    isSorted = false;
//                }
//            }
//        } while (!isSorted);

        // TODO: 02.11.2018
//        sort via comparator!!!


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}