package nhn2019.test1;//Please don't change class name 'Main'

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int num = Integer.parseInt(input);

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 1; i < num; i++) {
            if (treeSet.contains(i))
                break;

            if (num % i == 0) {
                treeSet.add(i);
                treeSet.add(num / i);
            }
        }

        String result = treeSet.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}