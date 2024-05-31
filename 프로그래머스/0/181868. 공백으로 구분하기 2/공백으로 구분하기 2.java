class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        while(true){
            if(my_string.contains("  "))my_string = my_string.replaceAll("  "," ");
            else{
                break;
            }
        }
        if(my_string.charAt(0) == ' '){
            my_string = my_string.substring(1,my_string.length());
        }
        if(my_string.charAt(my_string.length()-1) == ' '){
            my_string = my_string.substring(0,my_string.length()-1);
        }
        answer = my_string.split(" ");
        
        return answer;
    }
    
}