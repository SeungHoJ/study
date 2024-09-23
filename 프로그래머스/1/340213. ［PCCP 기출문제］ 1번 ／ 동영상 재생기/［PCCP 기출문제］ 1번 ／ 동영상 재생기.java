class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int videoLen = Integer.parseInt(video_len.replace(":",""));
        int currentTime = Integer.parseInt(pos.replace(":",""));
        int opStart = Integer.parseInt(op_start.replace(":",""));
        int opEnd = Integer.parseInt(op_end.replace(":",""));
        for(int i = 0; i < commands.length; i++){
            if(opStart <= currentTime && currentTime <= opEnd){
                    currentTime = opEnd;
                }
            if(commands[i].equals("next")){
                currentTime += 10;
                if(currentTime % 100 >= 60)currentTime = currentTime+100-60;
                if(currentTime >= videoLen)currentTime = videoLen;
                if(opStart <= currentTime && currentTime <= opEnd){
                    currentTime = opEnd;
                }
            }else{
                if(currentTime % 100 >= 10){
                    currentTime-= 10;
                    if(currentTime < 0)currentTime = 0;
                    if(opStart <= currentTime && currentTime <= opEnd){
                    currentTime = opEnd;
                }
                }else{
                    currentTime = currentTime -100+50;
                    if(currentTime < 0)currentTime = 0;
                    if(opStart <= currentTime && currentTime <= opEnd){
                    currentTime = opEnd;
                }
                }
            }
        }
        String str = String.format("%4d", currentTime).replace(" ", "0");
        for(int i =0; i < str.length(); i++){
            answer += str.charAt(i);
            if(i == 1)answer+= ":";
        }
        return answer;
    }
}