
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int count1 = total / num - ((num-1) / 2);;
        int count2 = total / num - num / 2 + 1;
        for(int i = 0; i < num; i++){
            if(total % num == 0){
                answer[i] = count1;
                count1++;
            }else{
                answer[i] = count2;
                count2++;
            }
        }
        
        return answer;
    }
}