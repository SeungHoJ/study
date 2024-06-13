import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int maxLen = 0;
        for(int i = 0; i < strArr.length; i++){
            if(maxLen < strArr[i].length())maxLen = strArr[i].length();
        }
        int [] arr = new int[maxLen+1];
        for(int i = 0; i < strArr.length; i++){
            arr[strArr[i].length()]++;
        }
        answer = Arrays.stream(arr).max().getAsInt();
        return answer;
    }
}