package exone;

import java.util.*;

public class SmallestNonOccurringInt {
    public static int solution(int[] arr) {
        int smallestNonOccurring = 0;
        Set<Integer> set = new HashSet<>();

        // remove repeated items and exclude negatives
        for (int item : arr) {
            if (item > 0) {
                set.add(item);
            }
        }

        for (int i = 1; i <= arr.length + 1; i++) {
            if (!set.contains(i)) {
                smallestNonOccurring = i;
                break;
            }
        }

        return smallestNonOccurring;

    }

    public static void main(String[] args) {
        int[] input = {1,3,6,4,1,2};
        int[] input2 = {5,-1,-3};
        int ans = solution(input);
        int ans2 = solution(input2);

        System.out.println(ans);
        System.out.println(ans2);
    }
}
