class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = Integer.toString(x);
        int add = 0;
        for(int i = 0; i < num.length(); i++){
            add += Integer.parseInt(num.charAt(i)+"");
        }
        if(x % add != 0){
            answer = false;
        }
        return answer;
    }
}