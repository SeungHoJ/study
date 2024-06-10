import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            intStrs[i] = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(intStrs[i]) > k){
                list.add(Integer.parseInt(intStrs[i]));
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray(); 
        return answer;
    }
}