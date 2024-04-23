import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count = 100;
        for(int i = 0; i < array.length;i++){
            int num = array[i]-n;
            if(num < 0){
                num *= -1;
                if(num < count){
                    count = num;
                    answer = array[i];
                }else if(num == count){
                    if(answer > array[i])answer = array[i];
                    
                }
                
            }
            else if(num < count){
                count = num;
                answer = array[i];
            }
            else if(num == count){
                    if(answer > array[i])answer = array[i];
                   
                }
             
    
        
    
        
        }  
        return answer;
    }
}
