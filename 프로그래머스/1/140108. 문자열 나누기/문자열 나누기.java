class Solution {
    public int solution(String s) {
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        char ch = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(ch == s.charAt(i)){
                count1++;
            }else{
                count2++;
            }
            if(count1 == count2){
                if(i + 1 < s.length()){
                    ch = s.charAt(i+1);
                }
                answer++;
                count1 = 0;
                count2 = 0;
            }else if(count1 != count2 && i == s.length() - 1){
                answer++;
            }
        }
        return answer;
    }
}