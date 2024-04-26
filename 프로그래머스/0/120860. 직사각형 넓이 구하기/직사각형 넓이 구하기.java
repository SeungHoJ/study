class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int M = 0;
        int N = 0;
        for(int i = 1; i < 4; i++){
            if(dots[0][0]== dots[i][0]){
                M = dots[0][1] - dots[i][1];
            }
            if(dots[0][1]== dots[i][1]){
                N = dots[0][0] - dots[i][0];
            }
        }
       
        if(M < 0)M = M*-1;
        if(N < 0)N = N*-1;
        answer = M * N;
        return answer;
    }
}