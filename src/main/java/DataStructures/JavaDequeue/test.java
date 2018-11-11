package DataStructures.JavaDequeue;

import java.util.*;

public class test {
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
                set.add(num);
            } else {
                int toRemove = (Integer) deque.removeLast();
                if (!deque.contains(toRemove)) {
                    set.remove(toRemove);
                }

                deque.push(num);
                set.add(num);

                if (set.size() == m) {
                    maxUnique = m;
                    break;
                }
            }

            maxUnique = Math.max(set.size(), maxUnique);

        }
        endTime = System.nanoTime();

        System.out.println(maxUnique);
        //System.out.println(maxUnique + " " + (endTime - startTime)/ 1_000_000);

    }
}