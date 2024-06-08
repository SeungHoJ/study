import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        answer = myString.split("x");
        List<String> list = new ArrayList<>();
        for(int i = 0; i < answer.length; i++){
            if(!answer[i].equals(""))list.add(answer[i]);
        }
        answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}