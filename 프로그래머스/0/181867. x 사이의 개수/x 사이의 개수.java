import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        int count = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                list.add(count);
                count = 0;
            }else{
                count++;
            }
        }
        if(myString.charAt(myString.length()-1) == 'x'){
            list.add(0);
        }else{
            list.add(count);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}