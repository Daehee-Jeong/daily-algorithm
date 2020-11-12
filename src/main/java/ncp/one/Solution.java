package ncp.one;

public class Solution {
    public String solution(String S) {
        // write your code in Java SE 8

        char[] chars = S.toCharArray();
        int maxCharIndex = 0;
        String result = "";

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] > chars[maxCharIndex]) {
                maxCharIndex = i;

                for (int j = 0; j < chars.length; j++) {
                    if (i != j) {
                        result += chars[j];
                    }
                }
                return result;
            }
        }

        result += chars[chars.length - 1];
        System.out.println(result);
        return result;
    }

    public String smallest(String S) {
        int length = S.length();
        String result = "";

        for (int i = 0; i < length - 1; i++) {
            if (S.charAt(i) > S.charAt(i + 1)) {
                for (int j = 0; j < length; j++) {
                    if (i != j) {
                        result += S.charAt(j);
                    }
                }
                return result;
            }
        }

        result = S.substring(0, length - 1);
        return result;
    }
}
