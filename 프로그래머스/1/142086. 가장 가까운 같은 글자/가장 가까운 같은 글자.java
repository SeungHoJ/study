import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        
        for(int i = 1; i < s.length(); i++){
            String str = s.substring(0,i);
            if(str.contains(s.charAt(i)+ "")){
                int index = str.lastIndexOf(s.charAt(i)+"");
                list.add(i-index);
            }
            else{
                list.add(-1);
            }
        }
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}