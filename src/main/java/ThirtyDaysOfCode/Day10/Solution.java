import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String out = Integer.toString(n, 2);
        int maxConsecutive = 0;
        int tempConsecutive = 0;
        for (int i = 0; i < out.length(); i++){
            if (out.charAt(i) == '0') {
                maxConsecutive = (tempConsecutive > maxConsecutive) ?
                        tempConsecutive : maxConsecutive;
                tempConsecutive = 0;
            }
            else {
                tempConsecutive++;
            }
        }
        maxConsecutive = (tempConsecutive > maxConsecutive) ? tempConsecutive : maxConsecutive;
        System.out.println(maxConsecutive);


        scanner.close();
    }
}