package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		//int sum = 0;
		int i = 1;
		while (i <= 10) {
		//	sum += i;
			i++;
		}

		i = 2;
		while (i <= 9) {
			int j = 1; // j는 괄호 안에서 선언해줘야 함
			while (j <= 9) {
				System.out.printf("%d*%d=%d%n", i, j, i * j);
			}
			j++;

			i++;

		}

	}

}
