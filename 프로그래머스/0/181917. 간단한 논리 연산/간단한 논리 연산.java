class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean flag1 = false;
        boolean flag2 = false;
        
        if(x1 || x2)flag1 = true;
        if(x3 || x4)flag2 = true;
        if(flag1 && flag2)answer = true;
        return answer;
    }
}