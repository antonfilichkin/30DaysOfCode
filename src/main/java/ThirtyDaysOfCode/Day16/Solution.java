package ThirtyDaysOfCode.Day16;

import java.util.*;
import static java.lang.Integer.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            System.out.print(parseInt(S));
        } catch (NumberFormatException e){
            System.out.print("Bad String");
        }
    }
}