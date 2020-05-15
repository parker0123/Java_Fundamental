package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또 복권 방식: 1부터 45까지의 숫자 중 임의 숫자 6개 생성
		// 그 후 6개 숫자 중 중복된 수자 나오면 안 됨
		// Math.random() : 0보다 크거나 같고 1보다 작은 양수를 double값으로 변환한다
		// -> 0.0000~ 0.99999

		// 1~45 임의랜덤값

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1; ///

			// boolean isExisted =???
			boolean isExisted = false;

			// 중복체크하는 코드
			for (int j = 0; j < lotto.length; j++) {
				if (lotto[j] == random) {
					isExisted = true;
					break;
				}
			}
			if (!isExisted) {
				lotto[i] = random;
			} else {
				i--;
			}
		}
			
		//숫자 오름차순 정렬 buble sort(ascending)이라고 함
		for(int i = 0; i<lotto.length; i++) {
				 for(int j = 0; j<lotto.length-i-1; j++) {
					 if(lotto[j]>lotto[j+1]) {
						//배열에서 두 개 값의 순서를 바꾸는 코드. 빈번하게 사용됨
						 // 하나를 temp로 넣어놓은 다음(temp 등)
						 //
						 int temp = lotto[j+1];
						 lotto [j+1] = lotto[j];
						 lotto[j] = temp;
					 }
				 }			 }
			
			
			
			for(int value: lotto) {
				
						System.out.println(value);
		
	}
	
	
	}
}
