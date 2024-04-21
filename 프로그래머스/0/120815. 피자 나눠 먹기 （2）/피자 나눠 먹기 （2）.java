class Solution {
    public int solution(int n) {
        int answer = 0;
        int n1 = n;
       LOOP : while(true){
            if(n1 % 6 == 0){
                answer = n1/6;
                break LOOP;
            }
            else n1 +=n;
        }
        
        
        return answer;
    }
}