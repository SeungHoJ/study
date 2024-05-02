class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String tmp = "";
        if(A.equals(B)){
            return answer;
        }
        while(true){
            if(!tmp.equals(""))A = tmp;
            tmp = A.substring(A.length()-1,A.length());
            tmp += A.substring(0,A.length()-1);
            answer ++;
            if(tmp.equals(B)){
                return answer;
            }
            if(answer >= A.length()){
                answer = -1;
                break;
        }
        
    }
        return answer;
}
}