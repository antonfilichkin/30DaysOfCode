package DataStructures.JavaDequeue;

import java.util.*;

public class test_old {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque<Integer>();
        Set set = new HashSet<Integer>();

        int maxUnique = Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();


            if (deque.size() < m) {
                deque.push(num);
            } else {
                deque.removeLast();
                deque.push(num);
                set = createSet(deque);
            }

            maxUnique = Math.max(set.size(), maxUnique);
        }

        if (deque.size() <= m) {
            set = createSet(deque);
        }

        maxUnique = Math.max(set.size(), maxUnique);

        endTime = System.nanoTime();

        System.out.println(maxUnique + " " + (endTime - startTime)/ 1_000_000);

    }

    private static Set createSet(Deque deque) {
        Set set = new HashSet<Integer>();
        set.addAll(deque);
        return set;
    }
}