class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int[] array2 = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }
        
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for(int i = 0; i < array2.length; i++){
            if(array2[i] == array[0]){
                answer[1] = i;
            }   
        }
        
        answer[0] = array[0];
        
        return answer;
    }
}