class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'p' : count1++;
                    break;
                case 'P' : count1++;
                    break;
                case 'y' : count2++;
                    break;
                case 'Y' : count2++;
                    break;
            }
        }
        if(count1 != count2){
            answer = false;
        }
        return answer;
    }
}