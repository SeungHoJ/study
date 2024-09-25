class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(true){
            if(wallet[0] < wallet[1]){
                int tmp = wallet[0];
                wallet[0]=wallet[1];
                wallet[1] = tmp;
            }
            if(bill[0] < bill[1]){
                int tmp = bill[0];
                bill[0] = bill[1];
                bill[1] = tmp;
            }
            if(wallet[0] < bill[0] || wallet[1] < bill[1]){
                bill[0] /= 2;
                answer++;
            }
            else{
                break;
            }
        }
        return answer;
    }
}