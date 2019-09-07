package programmers.test2019;

public class ZippedString {
    public int solution(String s) {
        int answer = 0;

        int wordLength = s.length();
        int maxSplitLength = s.length() / 2;

//        for (int i=1; i<maxSplitLength; i++) {
//            int currentSplitCount = i;
//            String zippedString = "";
//            for (int j=0; j<s.length(); j++) {
//                int counting = 1;
//                for (int k=j+1; k<s.length(); k++) {
//                    if (s.charAt(j) == s.charAt(k)) {
//                        System.out.println(s.charAt(j) + " equals " + s.charAt(k));
//                        counting++;
//                    } else {
//                        System.out.println(s.charAt(j) + " not equals " + s.charAt(k));
//                        break;
//                    }
//                }
//                zippedString += ( (counting > 1 ? counting : "") + s.substring(j, j+1));
//                j += (counting-1);
//            }
//            System.out.println(zippedString);
//        }

            String zippedString = "";
            int currentSplitCount = 6;
            for (int j=0; j<s.length(); j++) {
                int counting = 1;
                for (int k=j+currentSplitCount; k<s.length(); k++) {
                    String frontWord = s.substring(j, j+currentSplitCount);

                    if (k+currentSplitCount > s.length()) break;

                    String backWord = s.substring(k, k+currentSplitCount);
                    System.out.println("frontWord is " + frontWord);
                    System.out.println("backWord is " + backWord);

                    if (frontWord.equals(backWord)) {
                        System.out.println(frontWord + " equals " + backWord);
                        counting++;
                    } else {
                        System.out.println(frontWord + " not equals " + backWord);
                        break;
                    }
                }
                zippedString += ( (counting > 1 ? counting : "") + s.substring(j, j+currentSplitCount));
                System.out.println("zipping... =>" + zippedString);
                j += (currentSplitCount * counting-1);
            }
            System.out.println(zippedString);

        return answer;
    }
}
