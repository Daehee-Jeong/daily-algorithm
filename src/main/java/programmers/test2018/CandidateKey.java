package programmers.test2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CandidateKey {
    private List<String> totalCaseList = new ArrayList<>();

    public int solution(String[][] relation) {
        int answer = 0;

        int recordCount = relation.length;
        int columnCount = relation[0].length;

        int[] columnNumber = new int[columnCount];
        for (int i=0; i<columnNumber.length; i++) {
            columnNumber[i] += i;
        }

        boolean[] visited = new boolean[columnCount];

        /* 조합(Combination)을 이용해 후보키의 검증대상이 되는 모든 컬럼조합을 구해낸다 */
        for(int i=1; i<=columnCount; i++) {
            combination(columnNumber, visited, 0, columnCount, i);
        }

        System.out.println(Arrays.toString(totalCaseList.toArray()));

        List<String> candidateKeyList = new ArrayList<>();

        for (int i=0; i<totalCaseList.size(); i++) {
            String item = totalCaseList.get(i);
            /* 후보키인지 검증해봐야할 컬럼 조합 */
            String caseColumns[] = item.substring(0, item.length()-1).split(" ");
            System.out.println(Arrays.toString(caseColumns));

            HashSet<String> set = new HashSet<>();

            for (int j=0; j<recordCount; j++) {
                String key = "";
                for (int k=0; k<caseColumns.length; k++) {
                    key += (relation[j][Integer.parseInt(caseColumns[k])] + "_");
                }
                set.add(key);
            }

            System.out.println("set is " + Arrays.toString(set.toArray()));


            if (recordCount == set.size())
                candidateKeyList.add(item);
        }

        System.out.println("candidate keys are " + Arrays.toString(candidateKeyList.toArray()));

//        String str = candidateKeyList.get(0);
//        for (int j=1; j<candidateKeyList.size(); j++) {
//            if (candidateKeyList.get(j).indexOf(str) >= 0) {
//                candidateKeyList.remove(j);
//                j--;
//            }
//        }

        for (int i=0; i<candidateKeyList.size(); i++) {
            String str = candidateKeyList.get(i);
            for (int j=1+i; j<candidateKeyList.size(); j++) {
                if (candidateKeyList.get(j).indexOf(str) >= 0) {
                    candidateKeyList.remove(j);
                    j--;
                }
            }
        }

        System.out.println("completed candidate keys are " + Arrays.toString(candidateKeyList.toArray()));

        answer = candidateKeyList.size();

        // 정확성: 82.1 / 100.0

       return answer;
    }

    public void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            print(arr, visited, n);
            return;
        } else {
            for(int i=start; i<n; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
    }

    public void print(int[] arr, boolean[] visited, int n) {
        String str = "";
        for(int i=0; i<n; i++) {
            if(visited[i] == true) {
                str = str + (arr[i] + " ");
                System.out.print(arr[i] + " ");
            }
        }
        totalCaseList.add(str);
        System.out.println();
    }

}
