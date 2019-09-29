package nhn2019.quiz1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int N = Integer.parseInt(input);
        String[] cards = br.readLine().split(" ");

        String resultFlag = "N";
        int lastCardCount = N;

        HashSet<String> cardSet = new HashSet<>();
        int distinctCardCount = 0;

        for (int i = 0; i < cards.length; i++) {
            cardSet.add(cards[i]);
        }

        distinctCardCount = cardSet.size();

        if ((N + 1) % distinctCardCount == 0) {
            resultFlag = "Y";
            lastCardCount += 1;
        }

        if (N == distinctCardCount) {
            resultFlag = "Y";
        }

        System.out.println(resultFlag);
        System.out.println(String.valueOf(lastCardCount));
        System.out.println(distinctCardCount);
    }
}
