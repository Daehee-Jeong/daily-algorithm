package programmers.test2019;

import java.util.Arrays;

public class ZippedString {
    public int solution(String s) {
        int answer = 0;

        int wordLength = s.length();
        int maxSplitLength = s.length() / 2;

        if (maxSplitLength == 0) return 1;



        int[] zippedStringLengthArray = new int[maxSplitLength];

        for (int i=1; i<=maxSplitLength; i++) {
            String zippedString = "";
            int currentSplitCount = i;
            System.out.println("split count is " + currentSplitCount);
            boolean isValid = true;

            int totalWordEqualCount = 0;

            for (int j=0; j<s.length();) {
                System.out.println("[j] is " + j);
                int counting = 1;

                String frontWord = "";
                String backWord = "";

                for (int k=j+currentSplitCount; k<s.length();) {
                    System.out.println("[k] is " + k);

                    frontWord = s.substring(j, j+currentSplitCount);

                    if (k+currentSplitCount > s.length()) break;

                    backWord = s.substring(k, k+currentSplitCount);

                    System.out.println("frontWord is " + frontWord);
                    System.out.println("backWord is " + backWord);

                    if (frontWord.equals(backWord)) {
                        totalWordEqualCount++;
                        System.out.println(frontWord + " equals " + backWord);

                        counting++;
                        k+=currentSplitCount;
                    } else {
                        System.out.println(frontWord + " not equals " + backWord);

                        System.out.println("totalWordEqualCount : " + totalWordEqualCount);
                        System.out.println("j : " + j);
                        System.out.println("s.substring(0, j).length() : " + s.substring(0, j).length());
                        System.out.println("currentSplitCount : " + currentSplitCount);
                        if (totalWordEqualCount ==0 && s.substring(0, j).length() != currentSplitCount) {
                            System.out.println("invalid : ");
                            isValid = false;
                        }

                        break;
                    }
                    System.out.println("");
                } // inner for

                if (counting > 1) {
                    zippedString += (counting + frontWord);
                    j += (currentSplitCount * (counting));
                } else {
                    zippedString += s.substring(j, j+1);
                    j++;
                }

            } // outer for

            if (isValid) {
                zippedStringLengthArray[i-1] = zippedString.length();
            } else {
                zippedStringLengthArray[i-1] = s.length();
            }
//            zippedStringLengthArray[i-1] = zippedString.length();

//            if (zippedString.charAt(0) >= 'a' && zippedString.charAt(0) <= 'z') {
//                zippedStringLengthArray[i-1] = s.length();
//            } else {
//                zippedStringLengthArray[i-1] = zippedString.length();
//            }

            System.out.println("zipped string is " + zippedString);
            System.out.println("========================");
        }

        answer = Integer.MAX_VALUE;

        System.out.println(Arrays.toString(zippedStringLengthArray));

        for (int i=0; i<zippedStringLengthArray.length; i++) {
            if (answer > zippedStringLengthArray[i])
                answer = zippedStringLengthArray[i];
        }

//        String zippedString = "";
//        int currentSplitCount = 5;
//        for (int j=0; j<s.length(); j++) {
//            int counting = 1;
//            for (int k=j+currentSplitCount; k<s.length(); k++) {
//                String frontWord = s.substring(j, j+currentSplitCount);
//
//                if (k+currentSplitCount > s.length()) break;
//
//                String backWord = s.substring(k, k+currentSplitCount);
//                System.out.println("frontWord is " + frontWord);
//                System.out.println("backWord is " + backWord);
//
//                if (frontWord.equals(backWord)) {
//                    System.out.println(frontWord + " equals " + backWord);
//                    counting++;
//                } else {
//                    System.out.println(frontWord + " not equals " + backWord);
//                    break;
//                }
//            }
//            if (j+currentSplitCount > s.length()) break;
//
//            zippedString += ( (counting > 1 ? counting : "") + s.substring(j, j+currentSplitCount));
//            System.out.println("zipping... =>" + zippedString);
//            j += (currentSplitCount * counting-1);
//        }
//        System.out.println(zippedString);

        return answer;
    }
}

/*
class Solution {
    public int solution(String s) {
        int answer = 0;
        int maxSplitLength = s.length() / 2;

        if (maxSplitLength == 0) return 1;

        int[] zippedStringLengthArray = new int[maxSplitLength];

        for (int i=1; i<=maxSplitLength; i++) {
            String zippedString = "";
            int currentSplitCount = i;

            for (int j=0; j<s.length();) {
                int counting = 1;

                String frontWord = "";
                String backWord = "";

                for (int k=j+currentSplitCount; k<s.length();) {

                    frontWord = s.substring(j, j+currentSplitCount);

                    if (k+currentSplitCount > s.length()) break;

                    backWord = s.substring(k, k+currentSplitCount);

                    if (frontWord.equals(backWord)) {
                        counting++;
                        k+=currentSplitCount;
                    } else {
                        break;
                    }
                } // inner for

                if (counting > 1) {
                    zippedString += (counting + frontWord);
                    j += (currentSplitCount * (counting));
                } else {
                    zippedString += s.substring(j, j+1);
                    j++;
                }

            } // outer for

            if (zippedString.charAt(0) >= 'a' && zippedString.charAt(0) <= 'z') {
                zippedStringLengthArray[i-1] = s.length();
            } else {
                zippedStringLengthArray[i-1] = zippedString.length();
            }
        }

        answer = Integer.MAX_VALUE;
        for (int i=0; i<zippedStringLengthArray.length; i++) {
            if (answer > zippedStringLengthArray[i] && zippedStringLengthArray[i] != 0)
                answer = zippedStringLengthArray[i];
        }

        return answer;
    }
}
 */