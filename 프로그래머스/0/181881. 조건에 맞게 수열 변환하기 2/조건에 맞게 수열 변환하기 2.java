class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int idx = 0;
        while(true){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                    count++;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                    count++;
                }
            }
            if(count == 0){
                answer = idx;
                break;
            }
            idx++;
        }
        return answer;
    }
}