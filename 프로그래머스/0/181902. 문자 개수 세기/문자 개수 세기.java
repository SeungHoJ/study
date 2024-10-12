class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 65; i <= 90; i++){
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == (char)i){
                    answer[i-65]++;
                }
            }
        }
        for(int i = 97; i <= 122; i++){
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == (char)i){
                    answer[i-97+26]++;
                }
            }
        }
        
        return answer;
    }
}