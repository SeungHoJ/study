class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 0 ;i <= cipher.length(); i+=code){
            if(i > 0){
            char ch = cipher.charAt(i-1);
            answer += ch;
            }
        }
    
    
        return answer;
    }
}