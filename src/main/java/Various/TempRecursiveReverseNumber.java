import java.util.Scanner;

public class TempRecursiveReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long answer;
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        answer = reverse(number);
        endTime = System.nanoTime();

        System.out.println(answer + " - in " + (endTime - startTime));

        startTime = System.nanoTime();
        answer = reverseSpeed(number);
        endTime = System.nanoTime();

        System.out.println(answer + " - in " + (endTime - startTime));
    }

    public static long reverse(long number){
        if (number < 10){
            return number;
        }

        int base = 1;
        long tempNumber = number;
        while (tempNumber >= 10){
            base *= 10;
            tempNumber /= 10;
        }

        return number % 10 * base + reverse(number / 10);
    }

    public static long reverseSpeed(long number){
        int base = 0;
        long tempNumber = number;
        while (tempNumber >= 10){
            base++;
            tempNumber /= 10;
        }

        return reverseSpeedCompanion(number,base);
    }

    private static long reverseSpeedCompanion(long number, int base){
        if (number < 10){
            return number;
        }

        return number % 10 * (long) Math.pow(10, base) + reverse(number / 10);
    }

}
