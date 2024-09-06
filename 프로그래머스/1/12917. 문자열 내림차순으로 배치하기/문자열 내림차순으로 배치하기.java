import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            for(int j = i+1; j < charArr.length; j++){
                if(charArr[i] < charArr[j]){
                    char tmp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = tmp;
                }
            }
        }
        for(int i = 0; i < charArr.length; i++){
            answer += charArr[i]+"";
        }
        return answer;
    }
}