class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]==n)count++;
        }
        
        return count;
    }
}