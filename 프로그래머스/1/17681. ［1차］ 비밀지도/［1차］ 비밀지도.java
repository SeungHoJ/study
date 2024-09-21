class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < arr1.length; i++){
            String map = "";
            String bin1 =  Integer.toBinaryString(arr1[i]);
            String bin2=  Integer.toBinaryString(arr2[i]);
            
            bin1 = String.format("%"+n+"s", bin1).replace(" ", "0");
            bin2 = String.format("%"+n+"s", bin2).replace(" ", "0");
            for(int j = 0; j < bin1.length(); j++){
                if(bin1.charAt(j) == '1' || bin2.charAt(j) == '1'){
                    map += "#";
                }else{
                    map += " ";
                }
            }
            answer[i] = map;
        }
        
        return answer;
    }
}