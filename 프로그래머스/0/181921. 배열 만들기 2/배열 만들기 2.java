import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int num = 5;
        for(int i = l; i <= r; i++){
            int count = 0;
            String str = String.valueOf(i);
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '0' || str.charAt(j) == '5'){
                    count++;
                }
            }
            if(count == str.length()){
                list.add(i);
            }
            count = 0;
        }
        if(list.size() == 0){
                answer = new int[]{-1};
            }else{
                answer =  list.stream().mapToInt(k -> k).toArray();
            }
        return answer;
    }
}