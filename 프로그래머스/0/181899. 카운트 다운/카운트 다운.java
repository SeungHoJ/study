import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = start; i >= end_num; i--){
            list.add(i);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}