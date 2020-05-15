package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		// for문: 초기값;조건;증감꼴
		// 검사한 조건이 참이면 다시 반복 블럭을 수행. 반복 블록 수행 뒤에는 증감 부분 수행하고 다시 조건을 검사
		// false 나올 때가지 반복 수행
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;

		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		// 여기서 계행을 하기 위해서는 뒤에 %n을 붙여주면 된다
		// println이 없기 때문
		// System.out.printf("1부터 10까지 합은 %d입니다. %n", sum)

		// ctrl + space 누르면 가이드라인? 나옴 이걸 잘 이용하기

		for (double i = 1; i <= 10 && i % 2 == 0; i++) {
			sum += i;
		}
		System.out.printf("1~10 짝수 합은 %d임.%n", sum);

		sum = 0;

		for (double i = 1; i <= 10; i++) {
			if (i % 2 == 0) {

				sum += i;
			}
		}
		System.out.printf("1부터 10까지의 짝수의 합은 %d입니다.%n", sum);

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d%n", i, j, i * j);
			}
		}

		for (int i = 9; i >= 9; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d곱%d=%d ", i, j, i * j);//// 이상함

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*"); /// *를 i와 j로 나타내지 않아도 가능?
				System.out.println(); //// 중괄호 위치.
			}

			/*
			*
			**
			***
			****
			*****
			*****
			*/

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		/*
		****
		***
		**
		*
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 반복문 두 가지 (포문, while문)
		// 조건만 있으면 while문을 쓰고
		// 초기값, 조건, 증감이 있으면 for문을 쓴다고 생각.

	}
}
