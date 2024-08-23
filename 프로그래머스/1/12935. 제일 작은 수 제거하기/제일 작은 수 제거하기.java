import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        Arrays.sort(arr);
        int num = arr[0];
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == num){
                list.remove(i);
            }
        }
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}