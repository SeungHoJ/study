class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int count = 0;
        int count1 = 0;
        for(int num = i; num <= j; num++){
            count++;
        }
        String[] result = new String[count];
        for(int num = i; num <= j; num++){
            result[count1] = num+"";
            count1++;
        }
        for(int num = 0; num < result.length; num++){
            if(result[num].contains(Integer.toString(k))){
                for(int n = 0; n < result[num].length(); n++){
                    char ch = result[num].charAt(n);
                    if(k == (ch-'0')){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}