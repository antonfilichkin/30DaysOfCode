package DataStructures.JavaBitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitSetLength = scanner.nextInt();
        int numOfOperations = scanner.nextInt();
        BitSet bs1 = new BitSet(bitSetLength);
        BitSet bs2 = new BitSet(bitSetLength);
        for (int i = 0; i < numOfOperations; i++) {
            String operation = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            switch (operation) {
                case "AND":
                    if (a == 1) {
                        bs1.and(bs2);
                    } else {
                        bs2.and(bs1);
                    }
                    break;
                case "OR":
                    if (a == 1) {
                        bs1.or(bs2);
                    } else {
                        bs2.or(bs1);
                    }
                    break;
                case "XOR":
                    if (a == 1) {
                        bs1.xor(bs2);
                    } else {
                        bs2.xor(bs1);
                    }
                    break;
                case "FLIP":
                    if (a == 1) {
                        bs1.flip(b);
                    } else {
                        bs2.flip(b);
                    }
                    break;
                case "SET":
                    if (a == 1) {
                        bs1.set(b);
                    } else {
                        bs2.set(b);
                    }
                    break;
            }
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());
        }
    }
}