class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int score = 0;
        int match = 0;
        
         for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                match++;
                zeroCount++;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    match++;
                }
            }
        }
        switch(match){
            case 0 : score = 6;
                break;    
            case 1 : score = 6;
                break;
            case 2 : score = 5;
                break;
            case 3 : score = 4;
                break;
            case 4 : score = 3;
                break;
            case 5 : score = 2;
                break;
            case 6 : score = 1;
                break;
        }
        answer[0] = score;
        answer[1] = score+zeroCount;
        if(answer[1] > 6)answer[1] = 6;
        
        return answer;
    }
}