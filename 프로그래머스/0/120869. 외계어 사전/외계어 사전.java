import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String[] arr = {};
        for(int i = 0; i < dic.length; i++){
            arr = dic[i].split("");
            Arrays.sort(arr);
            if(Arrays.equals(spell,arr)){
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}