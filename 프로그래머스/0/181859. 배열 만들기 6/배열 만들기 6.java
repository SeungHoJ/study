import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(list.size() == 0){
                list.add(arr[i]);
            }
            else if(list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
            }else{
                list.add(arr[i]);
            }
            
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        if(answer.length == 0){
            answer = new int[]{-1};
        }
        return answer;
    }
}