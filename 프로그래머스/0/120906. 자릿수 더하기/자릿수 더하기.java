class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str="";
        
        
        str = n+"";
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            int num = ch - '0';
            answer += num;
        }
        return answer;
    }
}