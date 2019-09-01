package programmers;

public class JadenCase {
    public String solution(String s) {

        String answer = "";
        String[] arr = s.split(" ");

        for (int i=0; i<arr.length; i++) {
            /* 공백 기준으로 단어들을 자르고, 단어들은 문자형배열로 담는다 */
            String word = arr[i];
            char[] charArr = word.toCharArray();

            for (int j=0; j<charArr.length; j++) {
                /* 첫 번째 문자가 소문자일 경우 대문자로, 나머지 문자는 모두 소문자로 치환하는 과정 수행 */
                if (j==0) {
                    if (charArr[j] >= 'a' && charArr[j] <= 'z') {
                        charArr[j] = (char)(charArr[j]-32);
                    }
                } else {
                    if (charArr[j] >= 'A' && charArr[j] <= 'Z') {
                        charArr[j] = (char)(charArr[j]+32);
                    }
                }
            }

            arr[i] = new String(charArr);
        }

        /* 치환된 단어들을 이어붙여 변형된 문장 완성 */
        for (int i=0; i<arr.length; i++) {
            if (i != 0) answer += " ";
            answer += arr[i];
        }

        return answer;
    }
}
