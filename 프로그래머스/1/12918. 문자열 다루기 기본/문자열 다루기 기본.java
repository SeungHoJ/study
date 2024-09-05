class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for(int i = 65; i <= 122; i++){
            if(s.contains((char)i + "")){
                count++;
            }
        }
        if(count == 0 && (s.length() == 4 || s.length() == 6) ){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}