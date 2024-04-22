class Solution {
    public int[] solution(int[] emergency) {
       
        int[] subEmergency = new int[emergency.length];
        for(int i = 0;i < emergency.length;i++){
            subEmergency[i] = emergency[i];
        }
        
        int[] answer =new int[emergency.length];
        
        for(int i=0; i<emergency.length;i++){
            for(int j = i+1;j<emergency.length;j++){
                if(emergency[i] < emergency[j]){
                    int tmp = emergency[i];
                    emergency[i] = emergency[j];
                    emergency[j] = tmp;
                }
            }
        }
        for(int i = 0;i < emergency.length;i++){
            for(int j= 0;j < subEmergency.length;j++){
                if(subEmergency[i] == emergency[j]){
                    answer[i] = j+1;
                }
            } 
        }
        return answer;
    }
}