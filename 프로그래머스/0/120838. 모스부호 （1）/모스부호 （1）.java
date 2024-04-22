class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        String[] letterArr = letter.split(" ");
        
        for(int i = 0;i < letterArr.length;i++){
            for(int j = 0;j < morse.length;j++){
                if(letterArr[i].equals(morse[j])){
                    answer += str[j];
                }
            }
        }
        
     
        
        return answer;
    }
}