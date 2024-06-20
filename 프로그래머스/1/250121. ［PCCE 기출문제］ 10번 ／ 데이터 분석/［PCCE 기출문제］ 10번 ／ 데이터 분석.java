import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < data.length; i++){
            switch(ext){
                case "code" : if(data[i][0] < val_ext){
                    list.add(data[i]);
                }
                    break;   
                case "date" : if(data[i][1] < val_ext){
                    list.add(data[i]);
                }
                    break;
                case "maximum" : if(data[i][2] < val_ext){
                    list.add(data[i]);
                }
                    break;
                case "remain" : if(data[i][3] < val_ext){
                    list.add(data[i]);
                }
                    break;
            }
        }
        switch(sort_by){
            case "code" : list.sort((a,b) -> a[0] - b[0]);
                break;
            case "date" : list.sort((a,b) -> a[1] - b[1]);
                break;
            case "maximum" : list.sort((a,b) -> a[2] - b[2]);
                break;
            case "remain" :  list.sort((a,b) -> a[3] - b[3]);
                break;
        }
        
        answer = list.toArray(new int[list.size()][]);
        return answer;
    }
}