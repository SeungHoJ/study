import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int num = -1;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(num != arr[i]){
                list.add(arr[i]);
                num = arr[i];
            }
        }
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}