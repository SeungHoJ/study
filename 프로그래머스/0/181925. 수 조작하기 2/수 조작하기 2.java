class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0; i< numLog.length; i++){
            
            if(numLog[i+1]-numLog[i] == 1)answer += "w";
            else if(numLog[i+1]-numLog[i] == -1)answer += "s";
            else if(numLog[i+1]-numLog[i] == 10)answer += "d";
            else if(numLog[i+1]-numLog[i] == -10)answer += "a";
            
            if(i == numLog.length - 2)break;
        }
        return answer;
    }
}