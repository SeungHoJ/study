class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = "";
        
        for(int i = 0; i < my_string.length();i++){
            char ch = my_string.charAt(i);
            if('a' <= ch && ch <= 'z'){
                str = ch + "";
                answer += str.toUpperCase();
            }else{
                str = ch + "";
                answer += str.toLowerCase();
            }
        }
        
        return answer;
    }
}