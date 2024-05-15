class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < num_list.length; i++){
            if((i+1) % 2 == 0){
                num2 += num_list[i];
            }else{
                num1 += num_list[i];
            }
            if(num2 > num1)answer = num2;
            else{
                answer = num1;
            }
        }
        return answer;
    }
}