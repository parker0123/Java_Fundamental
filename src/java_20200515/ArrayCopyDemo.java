
package java_20200515;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "watermelon", "blueberry" };

		String[] temp = new String[6];

		// arraycopy(원본배열, 원본배열의 위치, 복사할 배열, 복사할  배열의 위치, 원본배열의 4개 요소를 복사)
		// 라는 뜻

		System.arraycopy(fruits, 0, temp, 2, 4);
		System.out.println();

		temp[0] = "peach";
		temp[1] = "pear";

		// 출력할 때 숫자를 쓴ㄴ 대신 temp.length로 배열의 길이를 잡는 걸 권장

		for (int i = 0; i < temp.length; i++) {

			System.out.println(temp[i]);
		}

		// ennhance 포문
		for (String value : temp) {
			System.out.println(value);
		}
	}

}
