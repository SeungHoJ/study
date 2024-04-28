import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> list = new ArrayList(){};
        
        int strSize = my_str.length();
        int startPoint = 0;
        int endPoint = n;
        while(true){
            if(strSize <= endPoint){
                String tmp = "";
                tmp = my_str.substring(startPoint,strSize);
                list.add(tmp);
                break;
            }
            else{
                String tmp = "";
                tmp = my_str.substring(startPoint,endPoint);
                list.add(tmp);
                startPoint += n;
                endPoint += n;
            }
        }
        
        
        String[] arr = list.toArray(String[]::new); 
        answer = arr;
        return answer;
    }
}