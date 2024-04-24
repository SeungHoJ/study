class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 0;
        for(int i = 1; i <= k; i ++){
            answer = numbers[count];
            if(count == numbers.length-1)count = 1;
            else if(count == numbers.length-2)count = 0;
            else{
                count+=2;
            }
            
        }
        
        return answer;
    }
}