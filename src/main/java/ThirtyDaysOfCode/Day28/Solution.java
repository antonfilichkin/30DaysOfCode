package ThirtyDaysOfCode.Day28;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> emails = new ArrayList<String>();

        for (int NItr = 0, i=0; NItr < N; NItr++) {

            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

//            if (emailID.endsWith("@gmail.com")){
//                emails.add(firstName);
//            }

            Pattern pattern = Pattern.compile("[a-z.]+@gmail\\.com");
            Matcher matcher = pattern.matcher(emailID);

            if (matcher.matches()) {
                emails.add(firstName);
            }

        }

        scanner.close();

        Collections.sort(emails);
        for (String element : emails) {
            System.out.println(element);
        }

    }
}

//6
//riya riya@gmail.com
//julia julia@julia.me
//julia sjulia@gmail.com
//julia julia@gmail.com
//samantha samantha@gmail.com
//tanya tanya@gmail.com