class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;
        String[] arr = polynomial.split("\\+");
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replaceAll(" ","");
            if(arr[i].contains("x")){
                arr[i] = arr[i].replaceAll("x","");
                if(arr[i].equals("")){
                    xNum += 1;
                }else{
                    xNum += Integer.parseInt(arr[i]);
                }
            }else{
                num += Integer.parseInt(arr[i]);
            }
        }
        if(xNum == 1){
            answer = "x";
        }
        else if(xNum != 0){
            answer += Integer.toString(xNum) + "x";
        }
        
        if(num != 0 && !answer.equals("")){
            answer += " + " + Integer.toString(num);
        }
        if(num != 0 && answer.equals("")){
            answer += Integer.toString(num); 
        }
        return answer;
    }
}