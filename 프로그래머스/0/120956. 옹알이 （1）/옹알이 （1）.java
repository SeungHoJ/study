class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].contains("aya")){
                babbling[i] = babbling[i].replace("aya","t");
            }
            if(babbling[i].contains("ye")){
                babbling[i] = babbling[i].replace("ye","t");
            }
            if(babbling[i].contains("woo")){
                babbling[i] = babbling[i].replace("woo","t");
            }
            if(babbling[i].contains("ma")){
                babbling[i] = babbling[i].replace("ma","t");
            }
            for(int j = 0; j < babbling[i].length(); j++){
                if(babbling[i].charAt(j) != 't')break;
                if(j == babbling[i].length() - 1)answer++;
            }
        }
        return answer;
    }
}