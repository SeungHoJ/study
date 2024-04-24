class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
	    
        
	for(int i=0;i < array.length;i++) {
		if(max < array[i]) {
			max = array[i];
		}
	}
        
	int [] counts = new int[max +1];
        
	for(int i =0;i< array.length;i++) {
		counts[array[i]]+=1;
		}
        
	int countMax = 0;
	for(int i = 0;i < counts.length;i++) {
		if(countMax < counts[i]) {
			countMax = counts[i];
			answer = i;
		
		}
	}
	
	int dup = 0;
	for(int i= 0; i <counts.length;i++) {
		if(counts[i] == countMax) {
			dup++;
		}
	}
	if(dup > 1) {
		answer = -1;
	}
        
        
        return answer;
    }
}