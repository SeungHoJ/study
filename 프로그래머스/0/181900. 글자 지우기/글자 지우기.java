import java.util.*;
import java.util.Collections;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
    
        Arrays.sort(indices);
        StringBuffer sb = new StringBuffer();
        
        sb.append(my_string);
        for(int i = indices.length -1; i >= 0; i--){
            sb.deleteCharAt(indices[i]);
        }
        answer = sb.toString();
        return answer;
    }
}