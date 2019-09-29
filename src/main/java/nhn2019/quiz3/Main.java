package nhn2019.quiz3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int N = Integer.parseInt(input);

        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String command = br.readLine().split(" ")[0];

            if ("enqueue".equals(command)) {
                int num = Integer.parseInt(br.readLine().split(" ")[0]);
                list.add(num);

                if (map.get(num) == null) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }

            } else if ("dequeue".equals(command)) {
                map.firstKey();
            }
        }

        System.out.println();

    }
}
