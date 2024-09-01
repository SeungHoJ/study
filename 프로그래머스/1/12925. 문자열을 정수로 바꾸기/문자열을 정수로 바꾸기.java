class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        if(s.charAt(0) == '-'){
            for(int i = 1; i < s.length(); i++){
                str += s.charAt(i);
            }
            answer = Integer.parseInt(str) * -1;
        }else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}