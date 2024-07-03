class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i =0; i < s.length(); i++){
            int n = index;
            char ch = s.charAt(i);
            while(n > 0){
                ch += 1;
                if(ch == 123)ch = 97;
                if(!skip.contains(ch+""))n--;
            }
            answer += ch;
        }
        return answer;
    }
}