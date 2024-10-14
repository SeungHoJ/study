class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                answer = new String[i];
                if(i != 0){
                    for(int j = 0; j < i; j++){
                        answer[j] = str_list[j];
                    }
                }
                break;
            }
            else if(str_list[i].equals("r")){
                answer = new String[str_list.length - i - 1];
                int count = 0;
                if(i != str_list.length -1){
                    for(int j = i+1; j < str_list.length; j++){
                        answer[count] = str_list[j];
                        count++;
                    }
                }
                break;
            }
        }
        return answer;
    }
}