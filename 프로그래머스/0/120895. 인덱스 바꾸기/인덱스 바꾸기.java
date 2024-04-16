class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char tmp1 = '0';
        char tmp2 = '0';
        for(int i = 0; i < my_string.length(); i++){
            tmp1 = my_string.charAt(num1);
            tmp2 = my_string.charAt(num2);
        }
         for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(i == num1){
                ch = tmp2;
                answer += ch;
            }    
            else if(i == num2){
                ch = tmp1;
                answer += ch;
            }    
            else{
                answer += ch;
            }
        }
        
        return answer;
    }
}