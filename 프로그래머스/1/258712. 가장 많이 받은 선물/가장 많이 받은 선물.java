class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] giftpoint = new int[friends.length];
        int[] giftcount = new int[friends.length];
        
        for(int i = 0; i < gifts.length; i++){
            String[] gift = gifts[i].split(" ");
            for(int j = 0; j < friends.length; j++){
                if(friends[j].equals(gift[0]))giftpoint[j]++;
                else if(friends[j].equals(gift[1]))giftpoint[j]--;
            }
        }
        
        for(int i = 0; i < friends.length; i++){
            for(int j = i+1; j < friends.length; j++){
                int fri1 = 0;
                int fri2 = 0;
                for(int k = 0; k < gifts.length; k++){
                    if(gifts[k].equals(friends[i] + " " + friends[j])){
                        fri1++;
                    }else if(gifts[k].equals(friends[j] + " " + friends[i])){
                        fri2++;
                    }
                }
                if(fri1 > fri2)giftcount[i]++;
                else if(fri2 > fri1)giftcount[j]++;
                else if(fri1 == fri2 && giftpoint[i] > giftpoint[j])giftcount[i]++;
                else if(fri1 == fri2 && giftpoint[j] > giftpoint[i])giftcount[j]++;
            }            
        }
        for(int i = 0; i < giftcount.length; i++){
            if(giftcount[i] > answer)answer = giftcount[i];
        }
        return answer;
    }
}