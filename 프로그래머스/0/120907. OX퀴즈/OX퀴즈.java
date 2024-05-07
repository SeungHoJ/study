class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        int tmp1 = 0;
        int tmp2 = 0;
        
        for(int i = 0; i < quiz.length; i++){
            String[] arr = quiz[i].split("=");
            arr[1] = arr[1].replaceAll(" ","");
            
            String[] newArr = arr[0].split(" ");
            if(newArr[1].equals("-")){
                tmp1 = Integer.parseInt(newArr[0]) - Integer.parseInt(newArr[2]);
            }
             if(newArr[1].equals("+")){
                tmp1 = Integer.parseInt(newArr[0]) + Integer.parseInt(newArr[2]);
            }
            tmp2 = Integer.parseInt(arr[1]);
            if(tmp1 == tmp2){
                quiz[i] = "O";
            }else{
                quiz[i] = "X";
            }
        }
        answer = quiz;
        return answer;
    }
}