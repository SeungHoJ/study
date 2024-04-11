class Solution {
    public int solution(int price) {
        int answer = 0;
        double danswer = 0.0;
        double sale =0.0;
        
        if(100000 <=price && price < 300000 ){
            sale = price/10*0.5;
            danswer = (double)price - sale;
        }
        else if(300000 <=price && price < 500000 ){
            sale = price/10*1.0;
            danswer = (double)price - sale;
        }
        else if(price >= 500000){
            sale = price/10*2.0;
            danswer = (double)price - sale;
        }
        else{
            danswer = price;
        }
        answer = (int)danswer;
        return answer;
    }
}