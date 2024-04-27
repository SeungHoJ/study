import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int num = n;
        int count = 0;
        Set<Integer> set = new LinkedHashSet();
        for(int i = 2; i <= n; i++){
            count = 0;
            for(int j = 2; j <= i; j++){
                if(i%j == 0)count++;
            }
            if(count == 1){
                if(n%i == 0){
                    num = n/i;
                    set.add(i);
                }
            }
        }
        Integer[] arr = set.toArray(new Integer[0]);
        answer = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}