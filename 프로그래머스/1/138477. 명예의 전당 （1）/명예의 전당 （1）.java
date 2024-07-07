import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> legend = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
                if(i < k){
                    legend.add(score[i]);
                    Collections.sort(legend);
                    list.add(legend.get(0));
                    
                }else{
                    if(legend.get(0) < score[i]){
                        legend.add(score[i]);
                        legend.remove(0);
                        Collections.sort(legend);
                    }
                    list.add(legend.get(0));
                }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}