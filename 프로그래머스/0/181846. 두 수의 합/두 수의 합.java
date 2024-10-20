import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        BigInteger num = n1.add(n2);
        answer = num.toString();
        return answer;
    }
}