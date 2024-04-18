class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                    
                }
                
            }
        }   
        if(numbers[numbers.length-1]*numbers[numbers.length-2] < numbers[0]*numbers[1]){
            answer = numbers[0]*numbers[1];
        }else{
            answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        }
        return answer;
    }
}