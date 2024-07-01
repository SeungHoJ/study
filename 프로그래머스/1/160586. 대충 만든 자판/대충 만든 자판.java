class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                int index = 1000;
                for(int k = 0; k < keymap.length; k++){
                    int tmp = keymap[k].indexOf(targets[i].charAt(j)+"");
                    if(0<= tmp && tmp <= index){
                        index = tmp;
                    }
                }
                if(index != 1000){
                    answer[i] += index+1;
                }else{
                    answer[i] = -1;
                    break;
                }
                
            }
            
        }
        return answer;
    }
}