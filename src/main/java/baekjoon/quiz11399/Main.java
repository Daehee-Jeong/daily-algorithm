package baekjoon.quiz11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        // 입력받은 배열을 오름차순 정렬
        Integer P[] = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        int time[] = new int[P.length];
        int accTime = 0;

        for (int i = 0;  i < P.length; i++) {
            if (i == 0) {
                time[i] = P[i];
                accTime = time[i];
                continue;
            }
            time[i] = accTime + P[i];
            accTime = time[i];
        }

        System.out.println(IntStream.of(time).sum());
    }
}