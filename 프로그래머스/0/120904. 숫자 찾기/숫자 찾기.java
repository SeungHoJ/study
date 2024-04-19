class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String num1 = num + "";
        
        for(int i = 0; i < num1.length(); i++){
            char ch = num1.charAt(i);
            int n1 = ch -'0';
            if(n1 == k){
                answer = i+1;
                break;
            }
            else{
                answer = -1;
            }
        }
        
        return answer;
    }
}