package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Quiz7662 {

    /**
     * [ INPUT ]
     * 2
     * 7
     * I 16
     * I -5643
     * D -1
     * D 1
     * D 1
     * I 123
     * D -1
     * 9
     * I -45
     * I 653
     * D 1
     * I -642
     * I 45
     * I 97
     * D 1
     * D -1
     * I 333
     *
     * [ OUTPUT ]
     * EMPTY
     * 333 -45
     */
    public String solution() {

        PriorityQueue<Integer> ascQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> descQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        Scanner sc = new Scanner(System.in);
        final int T = Integer.parseInt(sc.nextLine());

        String readLine = null;
        while( (readLine = sc.nextLine()) != null ) {
            if (isNumber(readLine)) {
                for (int i=0; i<Integer.parseInt(readLine); i++) {
                    String line = sc.nextLine();
                    String inputType = line.split(" ")[0];      // "I" or "D"
                    int num = Integer.parseInt(line.split(" ")[1]);

                    if ("I".equals(inputType)) {
                        System.out.println("Insert: " + num);
                        ascQueue.add(num);
                    } else if ("D".equals(inputType)) {
                        System.out.println("Delete: " + num);
                        if (num == 1) {
                            descQueue = new PriorityQueue<Integer>(ascQueue.size(), Collections.reverseOrder());
                            descQueue.addAll(ascQueue);
                            descQueue.poll();

                            ascQueue = new PriorityQueue<Integer>(descQueue.size());
                            ascQueue.addAll(descQueue);
                        } else if (num == -1) {
                            ascQueue.poll();
                        }
                    }
                } // parseLine loop
            }
        } // readLine loop

        String result = Arrays.toString(ascQueue.stream().toArray());

        return result;
    }

    private boolean isNumber(String numStr) {
        try {
            Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
