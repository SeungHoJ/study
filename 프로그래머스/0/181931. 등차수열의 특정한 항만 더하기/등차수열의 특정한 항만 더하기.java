class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = 0;
        for(int i = 0; i < included.length; i++){
           if(num == 0)num+=a;
           else{
               num+=d;
           }
           if(included[i])answer += num;
        }
        return answer;
    }
}