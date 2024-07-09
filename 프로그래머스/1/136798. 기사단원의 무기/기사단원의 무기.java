

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            int str = 0;
            for(int j = 1; j*j <= i; j++){
                if(j*j == i)str++;
                else if(i % j == 0)str += 2;
            }
            if(limit < str) str = power;
            answer += str;
        }
        
        
        
        return answer;
    }
}