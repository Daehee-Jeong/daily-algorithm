package nhn2019.quiz2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int playerCount = Integer.parseInt(input);

        int score[] = new int[playerCount];

        // TODO 팔로워를 참가자별로 Set을 두지 않고 모든참가자의 팔로우 관계에 대한 Map형식으로 다시 구성해보기
        ArrayList<HashSet<Integer>> setList = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            setList.add(new HashSet<>());
        }


        String[] inputArray = br.readLine().split(" ");
        int currentPlayerIdx = 0;

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("turn [" + i + "], user: " + (i%playerCount));
            System.out.println(" card: " + inputArray[i]);

            currentPlayerIdx %= playerCount;

            if ("A".equals(inputArray[i])) {
                score[currentPlayerIdx]++;
                setList.get(currentPlayerIdx).iterator().forEachRemaining(idx -> {
                    score[idx]++;
                });
                currentPlayerIdx++;
            } else if ("J".equals(inputArray[i])) {
                if (currentPlayerIdx == 0) {
                    score[playerCount-1]++;
                } else {
                    score[currentPlayerIdx-1]++;
                }

                if (currentPlayerIdx == playerCount-1) {
                    score[0]++;
                } else {
                    score[currentPlayerIdx+1]++;
                }
                currentPlayerIdx++;
            } else if ("Q".equals(inputArray[i])) {
                for (int j = 0; j < score.length; j++) {
                    score[j]++;
                }
                currentPlayerIdx++;
            } else if ("K".equals(inputArray[i])) {
                int followerIdx = Integer.parseInt(inputArray[i + 1]);
                setList.get(currentPlayerIdx).add(followerIdx);
                i++;
                currentPlayerIdx++;
            }

            System.out.println(Arrays.toString(score));
        }

        System.out.println(
                Arrays.stream(score).mapToObj(String::valueOf).collect(Collectors.joining(" "))
        );
    }
}

/*
5
K 1 K 2 K 0 A Q A
 */