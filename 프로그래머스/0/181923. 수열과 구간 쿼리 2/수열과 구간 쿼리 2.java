import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer,1000000);
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(arr[j] > queries[i][2] && answer[i] - queries[i][2] > arr[j] - queries[i][2] )answer[i] = arr[j];
            }
            if(answer[i] == 1000000){
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}