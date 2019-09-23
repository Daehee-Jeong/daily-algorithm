package naver2019;

import java.util.Arrays;
import java.util.Stack;

public class Quiz1 {
    public String[] solution(String[] record) {
        String[] answer = {};

        Stack<String> tempRepo = new Stack<>();     // 임시
        Stack<String> everRepo = new Stack<>();     // 영구

        for (int i=0; i<record.length; i++) {

            String[] fullCommand = record[i].split(" ");

            String command =  fullCommand[0];

            if ("RECEIVE".equals(command)) {
                System.out.println("RECEIVE");
                String mailAddr = fullCommand[1];
                tempRepo.push(mailAddr);
            } else if ("DELETE".equals(command)) {
                System.out.println("DELETE");
                if (tempRepo.size() != 0) {
                    tempRepo.pop();
                }
            } else if ("SAVE".equals(command)) {
                System.out.println("SAVE");
                if (tempRepo.size() != 0) {
                    tempRepo.stream().forEach( str -> {
                        everRepo.push(str);
                    });
                    tempRepo.clear();
                }
            }
        }

        System.out.println(Arrays.toString(tempRepo.stream().toArray()));
        System.out.println(Arrays.toString(everRepo.stream().toArray()));

        answer = everRepo.stream().toArray(String[]::new);

        return answer;
    }
}
