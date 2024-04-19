class Solution {
    public String solution(int age) {
        String result = "";
        String answer = ""+age;
        for(int i = 0;i < answer.length();i++){
            char ch = answer.charAt(i);
            ch +=49;
            result += ch;
        }
        return result;
    }
}