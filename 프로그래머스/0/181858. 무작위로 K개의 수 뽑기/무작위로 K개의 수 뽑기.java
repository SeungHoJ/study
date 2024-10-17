import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(list.size() == 0){
                list.add(arr[i]);
            }
            else if(list.size() == k)break;
            else if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        
        if(list.size() < k){
            int end = k - list.size();
            for(int i = 0; i < end; i++){
                list.add(-1);
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}