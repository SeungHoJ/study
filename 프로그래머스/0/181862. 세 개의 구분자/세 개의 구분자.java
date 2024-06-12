import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String[] strArr = {};
        List<String> list = new ArrayList<>();
        
        myStr = myStr.replace("b","a");
        myStr = myStr.replace("c","a");
        strArr = myStr.split("a");
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].equals("")){
                list.add(strArr[i]);
            }
        }
        if(list.size() == 0)list.add("EMPTY");
        answer = list.toArray(new String[list.size()]);
            
        return answer;
    }
}