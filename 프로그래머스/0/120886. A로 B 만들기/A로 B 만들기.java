import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        
        for(int i = 0; i < before.length(); i++){
            char ch = before.charAt(i);
            result1.add(ch+""); 
        }
        
        for(int i = 0; i < before.length(); i++){
            char ch = after.charAt(i);
            result2.add(ch+""); 
        }
        result1.sort(null);
        result2.sort(null);
        
        if(result1.equals(result2))answer = 1;
        else{answer=0;}
        return answer;
    }
}