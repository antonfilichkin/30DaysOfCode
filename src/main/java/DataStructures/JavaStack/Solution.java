package DataStructures.JavaStack;

import java.util.LinkedList;
import java.util.Scanner;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            char[] charArray = input.toCharArray();
            LinkedList stack = new LinkedList();

            for (char ch : charArray) {

                if (stack.isEmpty()) {
                    stack.add(ch);
                } else {
                    if (checkpair((char) stack.peekLast(), ch)) {
                        stack.removeLast();
                    } else {
                        stack.add(ch);
                    }
                }
            }

            System.out.println(stack.isEmpty());
        }

    }

    public static boolean checkpair(char a, char b) {
        switch (a) {
            case '(':
                if (b == ')') {
                    return true;
                }
                return false;

            case '[':
                if (b == ']') {
                    return true;
                }
                return false;

            case '{':
                if (b == '}') {
                    return true;
                }
                return false;
        }
        return false;
    }

}