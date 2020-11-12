package codility;

import java.util.Arrays;
import java.util.LinkedList;

public class RotateArray {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) {
            return A;
        }

        int rotateCount = K % A.length;
        return rotate(A, rotateCount);
    }

    private int[] rotate(int[] A, int count) {
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.stream(A).forEach(list::add);

        for (int i = 0; i < count; i++) {
            Integer last = list.removeLast();
            list.addFirst(last);
        }

        return list.stream().mapToInt(value -> value).toArray();
    }
}
