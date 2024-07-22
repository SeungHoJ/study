class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int maxY = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > maxX)maxX = sizes[i][0];
            if(sizes[i][1] > maxY)maxY = sizes[i][1];
        }
        answer = maxX * maxY;
        return answer;
    }
}