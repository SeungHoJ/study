import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<String> list = new ArrayList(){};
        String[] arr = s.split("");
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i].equals(arr[j]))count++;
            }
            if(count == 1){
                list.add(arr[i]);
            }
        }
        list.sort(null);
        String[] result = list.toArray(String[]::new);
        for(String s1 : result){
            answer += s1;
        }
        return answer;
    }
}