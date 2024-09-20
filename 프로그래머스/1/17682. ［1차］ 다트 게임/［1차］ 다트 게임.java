import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        if(dartResult.contains("10")){
            dartResult = dartResult.replaceAll("10","G");
        }
        for(int i = 0; i < dartResult.length(); i++){
            if(dartResult.charAt(i) == 'G'){
                int score = 10;
                list.add(score);
            }
            else if('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9'){
                int score = Integer.parseInt(dartResult.charAt(i)+"");
                list.add(score);
            }
            else if(dartResult.charAt(i) == 'S'){
                if(list.size() == 1 && dartResult.charAt(i+1) == '*'){
                    list.set(list.size()-1,list.get(list.size()-1)*2);
                }
                else if(i < dartResult.length()-1 && dartResult.charAt(i+1) == '*'){
                    list.set(list.size()-1,list.get(list.size()-1)*2);
                    list.set(list.size()-2,list.get(list.size()-2)*2);
                }
                else if(i < dartResult.length()-1 && dartResult.charAt(i+1) == '#'){
                    list.set(list.size()-1,list.get(list.size()-1)*-1);
                }
            }
            else if(dartResult.charAt(i) == 'D'){
                list.set(list.size()-1,(int)Math.pow(list.get(list.size()-1),2));
                if(list.size() == 1 && dartResult.charAt(i+1) == '*'){
                    list.set(list.size()-1,list.get(list.size()-1)*2);
                }
                else if(i < dartResult.length()-1 && dartResult.charAt(i+1) == '*'){
                    list.set(list.size()-1,list.get(list.size()-1)*2);
                    list.set(list.size()-2,list.get(list.size()-2)*2);
                }
                else if(i < dartResult.length()-1 && dartResult.charAt(i+1) == '#'){
                    list.set(list.size()-1,list.get(list.size()-1)*-1);
                }
            }
            else if(dartResult.charAt(i) == 'T'){
                list.set(list.size()-1,(int)Math.pow(list.get(list.size()-1),3));
                if(list.size() == 1 && dartResult.charAt(i+1) == '*'){
                    list.set(list.size()-1,list.get(list.size()-1)*2);
                }
                else if(i < dartResult.length()-1 && dartResult.charAt(i+1) == '*'){
                    list.set(list.size()-1,list.get(list.size()-1)*2);
                    list.set(list.size()-2,list.get(list.size()-2)*2);
                }
                else if(i < dartResult.length()-1 && dartResult.charAt(i+1) == '#'){
                    list.set(list.size()-1,list.get(list.size()-1)*-1);
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}