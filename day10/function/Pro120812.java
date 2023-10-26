package function;

class Solution{
	public int solution(int[] array) {
	int answer = 0;
	int max = 0;
	int countMax = 0;
	for(int i=0;i < array.length;i++) {
		if(max < array[i]) {
			max = array[i];
		}
	}
	int [] counts = new int[max +1];
	for(int i =0;i< array.length;i++) {
		counts[array[i]]+=1;
		}
	
	for(int i = 0;i < counts.length;i++) {
		if(countMax < counts[i]) {
			countMax = counts[i];
			answer = i;
		
		}
	}
	
	int dup = 0;
	for(int i= 0; i <counts.length;i++) {
		if(counts[i] == max) {
			dup++;
		}
	}
	if(dup > 1) {
		answer = -1;
	}
	
	
	
	
	
	
	
	
	
	
		return answer ;
	}
	
}	
	
	// 원소의 최대값을 먼저 구하고, 그길이만큼의 배열을 생성하여 횟수체크에 사용한다
	// 이 과정을 생략하고 싶다면 길이1001의 배열을 생성하면 된다
	// +1 이 들어가는 이유는 0부터 시작하는 index의 특성상 계산이 번거로워져서
	// 최빈값을 answer에 담아서 반환하면 된다
	// array에서 가장 많이 등장한 값을 찾아야 한다
	// array의 각 값이 등장한 횟수를 체크해야한다
	// 횟수에서 최대값을 찾아서, 횟수가 아닌 가장 많이 등장한 값을 answer에 담는다
	// 만약, 횟수에서 최대값이 중복된다면 answer에 -1을 담는다
	
	
	
	
	


public class Pro120812 {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int answer1= s.solution(new int[] {1,2,3,3,3,4});
		int answer2= s.solution(new int[] {1,1,2,2});
		int answer3= s.solution(new int[] {1});
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		
	}	
}

