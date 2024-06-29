class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i < t.length()-p.length()+1; i++){
            String str = t.substring(i,i+p.length());
            Long num1 = Long.parseLong(str);
            Long num2 = Long.parseLong(p);
            if(num1 <= num2)answer++;
        }
        return answer;
        
    }
}