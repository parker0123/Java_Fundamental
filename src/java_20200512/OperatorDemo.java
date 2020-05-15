package java_20200512;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		double e = 0;


		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = b / a;
		System.out.println(d);
		// 좌항 바이트 크기가 더 크면(더블은 8byte) 자동적으로 d에 캐스팅 된다.
		// 따라서 정수형을 나눌 때에는 double로 캐시팅해줌.
		// 이때 높은 쪽만 캐스팅 해주면 나머지도 같이 캐스팅 됨
		e = b / (double) a;
		System.out.println(e);
		// e 대신 d 넣으면 0이 됨

		c = a * b;
		System.out.println(c);

		a += b;// a=a+b;
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		a = 10;
		b = 20;
		a++; // a=a+1이라는 뜻
		++b;// b=b+1이라는 뜻.

		System.out.println(a); // 11
		System.out.println(b);// 21

		c = a++; // 대입 후 증가라는 뜻 따라서 c은 11
		System.out.println(c);

		c = ++b; // 증가 후 대입이라는 뜻 따라서 일단 b를 21->22로 증가시킨 다음
		// 이 22가 c에 들어간다
		System.out.println(c);

		a = 10;
		b = 20;
		d = 10.0;
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		isSuccess = a < b;
		System.out.println(isSuccess);
		isSuccess = a >= b;
		System.out.println(isSuccess);
		isSuccess = a <= b;
		System.out.println(isSuccess);
		isSuccess = a == d;
		System.out.println(isSuccess);
		// primitive data type의 경우 연산자는 자료형에 상관없이
		// 값만 같으면 true로 변환(10. 10.0 상관없음)
		isSuccess = a != d;
		System.out.println(isSuccess);

		System.out.println(4 & 5);
		System.out.println(4 ^ 5);

		a = 10;
		b = 20;
		//a&&b => a가 false이면 b 연산
		
		isSuccess= (a==b) && (++a==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
			
		//isSuccess= (a==b)  (++a==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		
		// 연산자 우선순위에서 &&와 ㅣㅣ
		// + 는 연결연산자와 산술연산자의 기능을 모두 갖고 있음
		//두개 중 한 개 이상이 문자열일 경우에는 연결연산자
		//두 개 모두 숫자일 경우 산술연산자
		System.out.println("123"+4+5+6);
		//여기선 이미 +가 연결연산자로 바뀌어씀 (""때문에 123이 
		//문자로 인식되는 중
		System.out.println(4+5+6+"123");
		//여기서는 +가 산술의 기능을 수행하다가 세 번째에서 
		//연결연산자로 기능 중
		System.out.println("123"+(4+5+6));
		//괄호는 연산자의 우선순위이기 때문에
		//여기서는 456이 우선 산술처리 된 후 이후 연결됨
		System.out.println(4+5+6+123);
	}
}
