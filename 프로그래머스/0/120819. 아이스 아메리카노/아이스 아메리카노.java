class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int iceAme = money / 5500;
        int change = money % 5500;
        answer[0] = iceAme;
        answer[1] = change;
        return answer;
    }
}