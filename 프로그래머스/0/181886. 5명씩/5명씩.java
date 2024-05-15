import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int count = 1;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < names.length; i++){
            if(count != 5 ){
                if(count == 1){
                    list.add(names[i]);
                }
                count++;
            }
            else if(count == 5){
                count = 1;
            }
            
        }
        answer = list.toArray(new String[list.size()]);

        
        return answer;
    }
}