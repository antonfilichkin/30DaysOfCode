package DataStructures._1DArrayPart2;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return solver(0, leap, game);
    }

    private static boolean solver(int pos, int leap, int[] game){
        if (pos > game.length-1){
            return true;
        }

        if (pos < 0 || game[pos] > 0){
            return false;
        }

        if (pos + leap > game.length-1){
            return true;
        }

        game[pos] = 2;
        return solver(pos+1,leap,game) || solver(pos+leap,leap,game) || solver(pos-1,leap,game);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO" );
        }
        scan.close();
    }
}