package codility.tapeequilibrium;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int[] subSumArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            subSumArray[i] = sum;
        }

        int[] totalMinusSubSumArray = new int[A.length];
        for (int i = 0; i < totalMinusSubSumArray.length; i++) {
            totalMinusSubSumArray[i] = sum - subSumArray[i];
        }

        int[] deltaArray = new int[A.length - 1];
        for (int i = 0; i < deltaArray.length; i++) {
            deltaArray[i] = totalMinusSubSumArray[i] - totalMinusSubSumArray[i + 1];
        }

        System.out.println(Arrays.toString(deltaArray));

        int min = 0;
        for (int i = 0; i < deltaArray.length - 1; i++) {
            int gap = deltaArray[i] - deltaArray[i + 1];
            if (gap >= 0) {
                min = gap;
            }
        }

        System.out.println(min);
        return min;
    }
}
