import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        int count = 0;
        while(true){
            list.add(my_string.substring(count,my_string.length()));
            count++;
            if(count == my_string.length())break;
        }
        list.sort(null);
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}