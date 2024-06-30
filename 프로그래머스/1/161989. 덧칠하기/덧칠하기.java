class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int len = section[section.length - 1] - section[0] + 1;
        if(m == 1){
            answer = section.length;
            return answer;
        }
        int del = 0;
        for(int i =0; i < section.length; i++){
            if(del <= section[i]){
                answer++;
                del = m+section[i];
            }
        }
        
        return answer;
    }
}