package airpremiea;

import java.util.Arrays;

public class Quiz3 {
    public int[] solution(int day, int k) {
        int[] lastDayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 1월 k일의 요일 계산

        int kDay = ( day + (k%7) ) % 7 - 1;
        if (kDay < 0) kDay += 7;


        // 다음달 k일의 요일은
        // 현재월 k일의 요일로부터 [달의 날짜 수 % 7] 일 뒤라는 규칙이 성립
        int[] dayGap = new int[12];
        for (int i=0; i<dayGap.length; i++) {
            dayGap[i] = lastDayOfMonth[i] % 7;
        }

        int[] payDayOfMonth = new int [12];
        payDayOfMonth[0] = kDay;
        for (int i=1; i<payDayOfMonth.length; i++) {
            kDay = (kDay + dayGap[i-1]) % 7;
            payDayOfMonth[i] = kDay;
        }

        int answer[] = new int[12];
        for (int i = 0; i<answer.length; i++) {
            if (payDayOfMonth[i] == 5 || payDayOfMonth[i] == 6) {
                answer[i] = 1;
                continue;
            }
            answer[i] = 0;
        }

        System.out.println(Arrays.toString(payDayOfMonth));
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
