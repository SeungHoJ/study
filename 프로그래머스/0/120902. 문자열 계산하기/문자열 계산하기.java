class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }
            if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        answer += Integer.parseInt(arr[0]);
        return answer;
    }
}