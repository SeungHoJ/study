class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                answer += i+"";
            }
        }
        String str = answer;
        answer += "0";
        for(int i = str.length() -1; i >= 0; i--){
            answer += str.charAt(i);
        }
        return answer;
    }
}