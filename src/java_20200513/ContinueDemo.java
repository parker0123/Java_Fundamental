package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i != 6) {
				sum += i;

			}

		}
		System.out.printf("1부터 10까지 합은 %d입니다. 단 6은 제외한다. %n", sum);

		// 또는 continue를 이용해 아래와 같이 할 수 있다
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6)	continue;
			{sum1 += i;	}
		}
		System.out.printf("1부터 10까지 합은 %d입니다. 단 6은 제외한다. %n", sum1);

		
		//각 구구단마다 곱4까지만 하고 다음 단으로 넘어가는 것
	labelname:	for(int i=2; i<=9; i++) {
			for (int j =1; j<=9; j++) {
				if(j==5) continue labelname;
			System.out.printf("%d곱%d = %d%n", i, j, i*j);
			}
		}
		
		
		
	}
}
