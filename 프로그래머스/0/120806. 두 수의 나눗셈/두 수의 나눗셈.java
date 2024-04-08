class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double danswer = answer;
        danswer = num1/(double)num2*1000;
        answer = (int)danswer;
        return answer;
    }
}