package codility;

import java.util.LinkedHashMap;
import java.util.Map;

public class UnpairedNumber {
    public int solution(int[] A) {
        Map<Integer, Integer> numberSumMap = new LinkedHashMap<>();

//        IntStream.range(0, A.length)
//                .forEach(index -> {
//                    Integer count = numberSumMap.get(A[index]);
//                    if (count == null) {
//                        numberSumMap.put(A[index], 1);
//                    } else {
//                        numberSumMap.put(A[index], ++count);
//                    }
//                });

        for (int i = 0; i < A.length; i++) {
            Integer count = numberSumMap.get(A[i]);
            if (count == null) {
                numberSumMap.put(A[i], 1);
            } else {
                numberSumMap.put(A[i], ++count);
            }
        }

        int unpairedNumber = numberSumMap.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0).findFirst()
                .get()
                .getKey()
                .intValue();

//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(numberSumMap.values().toArray()));
//        System.out.println(unpairedNumber);

        return unpairedNumber;
    }
}
