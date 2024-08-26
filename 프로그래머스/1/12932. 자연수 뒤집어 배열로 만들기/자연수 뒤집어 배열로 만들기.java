class Solution {
    public int[] solution(long n) {
        int idx = 0;
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        for(int i = s.length()-1; i >= 0; i--){
            answer[idx] = Integer.parseInt(s.charAt(i)+"");
            idx++;
        }
        return answer;
    }
}