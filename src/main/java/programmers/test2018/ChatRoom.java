package programmers.test2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatRoom {
    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> nickNames = new HashMap<>();
        List<String> resultList = new ArrayList<>();

        /* 입장 또는 닉네임 변경을 통해서 닉네임이 변경될때 Map으로 닉네임 관리 */
        for (int i=0; i<record.length; i++) {
            String[] words = record[i].split(" ");
            if ("Change".equals(words[0]) || "Enter".equals(words[0])) {
                nickNames.put(words[1], words[2]);
            }
        }

        /* 대화내용을 생성하며 닉네임Map으로 부터 닉네임 가져옴 */
        for (int i=0; i<record.length; i++) {
            String[] words = record[i].split(" ");
            if ("Enter".equals(words[0])) {
                resultList.add(nickNames.get(words[1])+"님이 들어왔습니다.");
            } else if ("Leave".equals(words[0])) {
                resultList.add(nickNames.get(words[1])+"님이 나갔습니다.");
            }
        }

        answer = new String[resultList.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}

/*
* ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
* ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
* */