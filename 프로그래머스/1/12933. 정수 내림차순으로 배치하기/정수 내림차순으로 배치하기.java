import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "";
        String str = String.valueOf(n);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i)+"");
        }
        list.sort(null);
        for(int i = list.size()-1; i >= 0; i--){
            s += list.get(i);
        }
        answer = Long.valueOf(s);
        return answer;
    }
}