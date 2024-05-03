class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int num = 0;
        answer = chicken / 10;
        num = answer + (chicken%10);
        while(num >= 10){
            answer += num / 10;
            num = (num / 10) + (num % 10);
        }
        return answer;
    }
}