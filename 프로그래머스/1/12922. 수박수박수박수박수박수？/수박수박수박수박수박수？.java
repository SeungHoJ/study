class Solution {
    public String solution(int n) {
        String answer = "";
        String str = "수박";
        if(n % 2 == 0){
            for(int i = 0; i < n/2; i++){
                answer += str;
            }
        }else{
            for(int i = 0; i < n/2; i++){
                answer += str;
            }
            answer += "수";
        }
        return answer;
    }
}