package codility.permmissingelem;

import java.util.*;

public class Solution {
    public int solution(int[] A) {
        /*
        * TreeSet 에 모두 담아 정렬된 상태를 만들고, 증가량이 1 을 넘는 시점을 찾는다
        * */

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        List<Integer> list = new ArrayList<>(set);

        int missingNumber = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if ((i + 1) != list.get(i)) {
                missingNumber = list.get(i) + 1;
            }
        }

        return missingNumber;
    }
}
