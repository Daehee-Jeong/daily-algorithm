package ncp.three;

public class Solution {
    public static final int FIVE = 5;

    public int solution(int N) {
        int sign = N < 0 ? -1 : 1;
        String numberString = String.valueOf(N * sign);

        for (int i = 0; i < numberString.length(); i++) {
            int number = numberString.charAt(i) - '0';

            if (sign > 0) {
                if (number <= FIVE) {
                    numberString = insertFive(numberString, i);
                    break;
                }
                if (i == numberString.length() - 1) {
                    numberString = numberString + FIVE;
                    break;
                }
            }

            if (sign < 0) {
                if (number >= FIVE) {
                    numberString = insertFive(numberString, i);
                    break;
                }

                if (i == numberString.length() - 1) {
                    numberString = numberString + FIVE;
                    break;
                }
            }

        }

        return Integer.valueOf(numberString) * sign;
    }

    private String insertFive(String numberString, int index) {
        return numberString.substring(0, index) + FIVE + numberString.substring(index);
    }
}
