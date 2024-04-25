class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        int[][] board2 = new int[len+2][len+2];
        
        
        for(int i = 0;i< board.length; i++){
            for(int j=0;j<board.length;j++){
                board2[i+1][j+1] = board[i][j];
            }
        }
        for(int i = 0;i<board2.length; i++){
            for(int j = 0;j< board2.length; j++){
                if(board2[i][j] == 1){
                    if(board2[i-1][j-1]!=1)board2[i-1][j-1] = 2;
                    if(board2[i-1][j]!=1)board2[i-1][j] = 2;
                    if(board2[i-1][j+1]!=1)board2[i-1][j+1] = 2;
                    if(board2[i][j-1]!=1)board2[i][j-1] = 2;
                    if(board2[i][j+1]!=1)board2[i][j+1] = 2;
                    if(board2[i+1][j-1]!=1)board2[i+1][j-1] = 2;
                    if(board2[i+1][j]!=1)board2[i+1][j] = 2;
                    if(board2[i+1][j+1]!=1)board2[i+1][j+1] = 2;
                }
            }
        }
        for(int i =0; i < board.length; i ++){
            for(int j = 0; j < board.length; j++){
                if(board2[i+1][j+1]==0){
                    answer++;
                }
            }
        } 
        return answer;
    }
}