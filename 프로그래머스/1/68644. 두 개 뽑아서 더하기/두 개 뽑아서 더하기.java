import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int num = -1;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i != j){
                    num = numbers[i]+numbers[j];   
                }
                if(!list.contains(num)&& num != -1)list.add(num);
            }
        }
        list.sort(null);
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}