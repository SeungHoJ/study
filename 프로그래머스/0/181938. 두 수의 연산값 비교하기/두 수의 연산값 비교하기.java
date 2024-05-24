class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num = "";
        num+= a+""+b+"";
       if(Integer.parseInt(num) >= 2*a*b)answer = Integer.parseInt(num);
        else{
            answer = 2*a*b;
        }
        return answer;
    }
}