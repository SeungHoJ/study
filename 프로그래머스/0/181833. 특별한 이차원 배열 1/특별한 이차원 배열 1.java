class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int count = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i][count] = 1;
            count++;
        }
        return answer;
    }
}