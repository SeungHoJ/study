class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = "";
        
        
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(('a' <= ch&&ch <='z') || ('A' <= ch&&ch <='Z')){
                ch = 'a';
            }
            str += ch;
        }
        while(str.contains("aa")){
            str = str.replace("aa","a");    
        }
        
        String[] strArr = str.split("a");
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].equals("")){
            answer += Integer.valueOf(strArr[i]);
            }
        }
        return answer;
    }
}