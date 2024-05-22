class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num1 = 0;
        int num2 = 1;
        for(int i =0; i < num_list.length; i++){
            num1 += num_list[i];
            num2 *= num_list[i];
        }
        num1 = num1 * num1;
        if(num1 > num2)answer = 1;
        return answer;
    }
}