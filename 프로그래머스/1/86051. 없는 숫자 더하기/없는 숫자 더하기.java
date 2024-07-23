import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        List<int[]> list =  Arrays.asList(numbers);
       
        for(int j = 0; j <=9 ; j++){
            count = 0;
            for(int i = 0; i < numbers.length; i++){
                if(j == numbers[i])count++;
            }
            if(count == 0)answer += j;
        }
        return answer;
    }
}