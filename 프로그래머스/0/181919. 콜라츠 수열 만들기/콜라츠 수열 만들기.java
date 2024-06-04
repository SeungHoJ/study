import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(true){
            if(n % 2 == 0){
                n = n/2;
                list.add(n);
                if(n == 1)break;
            }
            else{
                n = 3 * n + 1;
                list.add(n);
            }
        }
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}