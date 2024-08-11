import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        List<Integer> list = 
            Arrays.stream(reserve).boxed().collect(Collectors.toList());
        List<Integer> lostList = 
            Arrays.stream(lost).boxed().collect(Collectors.toList());
        
        for(int i = 0; i < lost.length; i++){
            if(list.contains(lost[i])){
                list.remove(Integer.valueOf(lost[i]));
                lostList.remove(Integer.valueOf(lost[i]));
            }
        }
        for(int i = 1; i <= n; i++){
            if(!lostList.contains(i)){
                answer++;
            }else{
                if(list.contains(i-1)){
                    answer++;
                    list.remove(Integer.valueOf(i-1));
                }
                else if(list.contains(i+1)){
                    answer++;
                    list.remove(Integer.valueOf(i+1));
                }
            }
        }
        return answer;
    }
}