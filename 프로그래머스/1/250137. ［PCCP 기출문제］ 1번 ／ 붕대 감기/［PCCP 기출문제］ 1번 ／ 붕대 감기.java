class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int count = 0;
        int attackcount = 0;
        int maxHealth = health;
        
        for(int i = 1; i <= attacks[attacks.length -1][0]; i++){
            attackcount = 0;
            for(int j = 0; j < attacks.length; j++){
                if(i == attacks[j][0]){
                    attackcount ++;
                    health -= attacks[j][1];
                    count = 0;
                    if(health <= 0){
                        answer = -1;
                        return answer;
                    }
                }
            }
            if(attackcount == 0){
                count++;
                health += bandage[1];
                if(count == bandage[0]){
                    count = 0;
                    health += bandage[2];
                }
                if(health > maxHealth)health = maxHealth;
            }
        }
        answer = health;
        return answer;
    }
}