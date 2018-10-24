package ExceptionHandling.TryCatch;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1;
        int v2;

        try {
            v1 = scanner.nextInt();
            v2 = scanner.nextInt();
            System.out.println(v1 / v2);
        } catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}