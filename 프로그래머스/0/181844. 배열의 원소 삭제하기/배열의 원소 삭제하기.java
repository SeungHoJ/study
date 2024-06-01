import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            list.add(arr[i]);
        }
        for(int i = 0; i < delete_list.length; i ++){
            list2.add(delete_list[i]);
        }
        list.removeAll(list2);
        
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}