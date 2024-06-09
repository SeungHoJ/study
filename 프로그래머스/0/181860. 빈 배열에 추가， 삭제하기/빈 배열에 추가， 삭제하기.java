import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++){
                    list.add(arr[i]);
                }
            }else if(flag[i] == false){
                for(int k = 0; k < arr[i]; k++){
                    list.remove(list.size() - 1);
                }
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}