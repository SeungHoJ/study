class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = "";
        String num2 = "";
        
        num1 = a+""+b+"";
        num2 = b+""+a+"";
        
        if(Integer.parseInt(num1) >= Integer.parseInt(num2))answer = Integer.parseInt(num1);
        else{
            answer = Integer.parseInt(num2);
        }
        return answer;
    }
}