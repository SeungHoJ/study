class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += (double)usage / 100 * change[i];
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}