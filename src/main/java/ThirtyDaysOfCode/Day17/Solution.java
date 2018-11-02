// must throw an exception with the message: n and p should be non-negative.

package ThirtyDaysOfCode.Day17;

import java.util.Scanner;

class Calculator{

    public int power(int a, int b) throws Exception{
        if (a < 0 || b < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.round(Math.pow(a, b));
    }
}


class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
