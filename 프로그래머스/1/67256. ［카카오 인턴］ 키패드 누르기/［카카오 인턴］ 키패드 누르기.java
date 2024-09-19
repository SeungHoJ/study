class Solution {
    private String calc(String hand,int lPoint,int rPoint,int num){
        int l = num - lPoint;
        int r = num - rPoint;
        String dis = "";
        if(l < 0)l *= -1;
        if(r < 0)r *= -1;
        l = l / 3 + l % 3;
        r = r / 3 + r % 3;
        if(l < r)dis = "L";
        else if(l > r)dis = "R";
        else if(hand.equals("left")){dis = "L";}
        else{dis = "R";}
        return dis;
        
}
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lPoint = 10;
        int rPoint = 12;
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += "L";
                lPoint = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += "R";
                rPoint = numbers[i];
            }else{
                if(numbers[i]==0)numbers[i] =11;
                String dis = calc(hand,lPoint,rPoint,numbers[i]);
                answer += dis;
                if(dis.equals("L"))lPoint = numbers[i];
                else{rPoint = numbers[i];}
            }
        }
        return answer;
    }
}