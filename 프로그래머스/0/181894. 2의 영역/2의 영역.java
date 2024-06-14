import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                num1 = i;
                break;
            }
        }
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 2){
                num2 = i;
                break;
            }
        }
        
            for(int i = num1; i <= num2; i++){
                list.add(arr[i]);
            }
        if(num1 == num2 && num1 == 0){
            int[] arr1 = new int[1];
            arr1[0] = -1;
            answer = arr1;
            return answer;
        }
        
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}