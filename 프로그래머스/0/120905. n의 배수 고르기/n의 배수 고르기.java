class Solution {
    public int[] solution(int n, int[] numlist) {
        int count1 = 0;
        int count = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0)count++;
        }
        int[] answer = new int[count];
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){answer[count1] = numlist[i];
            count1++;}
            
        }
        
        return answer;
    }
}