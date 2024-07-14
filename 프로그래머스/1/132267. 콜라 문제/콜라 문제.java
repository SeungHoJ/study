class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int num = 0;
        while(n >= a){
            num = n / a;
            n = n % a;
            answer += num * b;
            n += num * b;
        }
        return answer;
    }
}