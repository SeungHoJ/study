class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int maxX = (board[0]-1)/2;
        int maxY = (board[1]-1)/2;
        int x = 0;
        int y = 0;
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("up") && y != maxY ){
                y++;
            }
            if(keyinput[i].equals("down") && y != -maxY){
                y--;
            }
            if(keyinput[i].equals("left") && x != -maxX){
                x--;
            }
            if(keyinput[i].equals("right") && x != maxX){
                x++;
            }
        }
        int[] result = {x,y};
        answer = result;
        return answer;
    }
}