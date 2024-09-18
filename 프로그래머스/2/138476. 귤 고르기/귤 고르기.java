import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort((a,b) -> b-a);
    
        int sum = 0;
        for(int v : list){
            if(sum + v >= k){
                answer ++;
                break;
            }else{
                sum += v;
                answer++;
            }
        }
        
        return answer;
    }
}