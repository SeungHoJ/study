import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] goSet = new String[my_string.length()];
        Set<String> set = new LinkedHashSet<>();
        for(int i = 0; i < my_string.length();i++){
            char ch = my_string.charAt(i);
            goSet[i] = ch+"";
            
        }
         for(int i = 0; i < goSet.length;i++){
            set.add(goSet[i]);
         }
        goSet = set.toArray(new String[0]);
        for(int i = 0; i < goSet.length;i++){
            answer += goSet[i];
         }
        return answer;
    }
}