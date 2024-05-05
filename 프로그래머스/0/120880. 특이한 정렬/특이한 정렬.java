class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        int tmp1 = 0;
        int tmp2 = 0;
        for(int i = 0; i < numlist.length; i++){
            for(int j = i+1; j < numlist.length; j++){
                tmp1 = numlist[i] - n;
                tmp2 = numlist[j] - n;
                if(tmp1 < 0)tmp1 *= -1;
                if(tmp2 < 0)tmp2 *= -1;
                if((tmp1 > tmp2) || (tmp1 == tmp2 && numlist[i] < numlist[j])){
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        answer = numlist;
        return answer;
    }
}