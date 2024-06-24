import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        int score = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < photo.length; i++){
            score = 0;
            for(int j = 0; j <photo[i].length; j++){
                for(int k=0; k < name.length; k++){
                    if(name[k].equals(photo[i][j]))score+=yearning[k];
                }
                
            }
            list.add(score);
            
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}