class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num = 0;
        for(int i = 1; i < common.length; i ++){
            num = common[1] - common[0];
            if(common[i] == (common[i-1]) + num){
                answer = common[common.length -1] + num;
            }else{
                num = common[1] / common[0];
                answer = common[common.length -1] * num; 
            }
        }
        return answer;
    }
}