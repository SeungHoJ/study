class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for(int i = 0; i < park.length; i++){
            if(park[i].indexOf("S") != -1){
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }
        int x = park[0].length() - 1;
        int y = park.length - 1;
        
        for(int i = 0; i < routes.length; i++){
            String[] e =routes[i].split(" ");
            String e1 = e[0];
            int e2 = Integer.parseInt(e[1]);
            if(e1.equals("E") && answer[1] + e2 <= x){
                int count = 0;
                for(int j = 1; j <= e2; j++){
                    if(park[answer[0]].charAt(answer[1]+j) == 'X')count++;
                }
                if(count == 0){
                    answer[1] += e2;
                }
            }
            else if(e1.equals("S") && answer[0] + e2 <= y){
                int count = 0;
                for(int j = 1; j <= e2; j++){
                    if(park[answer[0]+j].charAt(answer[1]) == 'X')count++;
                }
                if(count == 0){
                    answer[0] += e2;
                }
            }else if(e1.equals("W") && answer[1] - e2 >= 0){
                int count = 0;
                for(int j = 1; j <= e2; j++){
                    if(park[answer[0]].charAt(answer[1]-j) == 'X')count++;
                }
                if(count == 0){
                    answer[1] -= e2;
                }
            }else if(e1.equals("N") && answer[0] - e2 >= 0){
                int count = 0;
                for(int j = 1; j <= e2; j++){
                    if(park[answer[0]-j].charAt(answer[1]) == 'X')count++;
                }
                if(count == 0){
                    answer[0] -= e2;
                }
            }
        }
        
        return answer;
    }
}