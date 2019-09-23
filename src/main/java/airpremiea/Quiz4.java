package airpremiea;

import java.util.*;

public class Quiz4 {
    public int[] solution(int[][] customer, int k) {
        Set<Integer> rooms = new LinkedHashSet<>();

        for (int i = 0; i < customer.length; i++) {
            if (customer[i][1] == 1) {
                rooms.add(customer[i][0]);
            }

            if (customer[i][1] == 0) {
                rooms.remove(customer[i][0]);
            }
        }

        List<Integer> answer = new LinkedList<>();
        Iterator<Integer> it = rooms.iterator();
        while (it.hasNext()) {
            if (answer.size() == rooms.size()) {
                break;
            }

            if (answer.size() == k) {
                break;
            }

            answer.add(it.next());
        }

        answer.sort(Comparator.naturalOrder());

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
