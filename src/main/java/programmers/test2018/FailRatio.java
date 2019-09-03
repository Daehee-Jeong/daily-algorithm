package programmers.test2018;

import java.util.*;

public class FailRatio {

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        int[] trialCount = new int[N];

        int[] stayCount = new int[N];

        TreeMap<Integer, Double> failRatio = new TreeMap<>();



        for (int i=0; i<stages.length; i++) {
            if (stages[i] == N+1) {
                /* 모두 클리어, 아무것도 하지 않음 */
            } else {
                stayCount[stages[i]-1]++;

            }


            for (int j=0; j<stages[i]; j++) {
                if (j < N) {
                    trialCount[j]++;
                }
            }
        }

        System.out.println(Arrays.toString(trialCount));
        System.out.println(Arrays.toString(stayCount));

        for (int i=0; i<N; i++) {
            if (trialCount[i] == 0 && stayCount[i] == 0) {
                failRatio.put(i+1, (double)0);
            } else {
                failRatio.put(i+1, (double)stayCount[i] / (double)trialCount[i]);
            }

        }

        answer = new int[N];

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(failRatio.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if (o1.getValue() - o2.getValue() > 0) {
                    return -1;
                } else if (o1.getValue() - o2.getValue() < 0) {
                    return 1;
                } else {
                    return 0; /* 0 리턴의 경우를 정의하지 않았어서 정확도 100이 나오지 못했다 */
                }
            }
        });

        for (int i=0; i<N; i++) {
            answer[i] = ((Map.Entry<Integer, Double>) list.get(i)).getKey();
        }

        return answer;
    }
}
