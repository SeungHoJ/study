class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int count = 1;
        
        while(count <= k){
            for(int i = 0; i < my_string.length();i++){
                answer += my_string.charAt(i) + "";
            }
            count++;
        }
        return answer;
    }
}