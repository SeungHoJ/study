class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = "";
        str = my_string.substring(s,e+1);
        for(int i = str.length() -1; i >= 0; i--){
            answer += str.charAt(i) + "";
        }
        my_string = my_string.replace(str,answer);
        answer = my_string;
        return answer;
    }
}