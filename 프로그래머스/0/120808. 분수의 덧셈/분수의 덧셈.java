class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int maximum = 1;
	    
	     	
	     
	     int result1 = numer1 * denom2 + numer2 * denom1;
	     int result2 = denom1 * denom2;
	       
	            
	        
	     for(int i = 1; i <= result1; i++) {
	    	   if(result1 % i == 0 && result2 % i == 0) {
	    		   maximum = i;
	    	   }
	       }
       
        int [] answer = {result1/maximum,result2/maximum};
        
         
         return answer;
    }
}