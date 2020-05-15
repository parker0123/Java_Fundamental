package java_20200512;

public class SSnDemo {
public static void main(String[] args) {
	int a1 = 1;
	int a2 = 1;
	int a3 = 1;
	int a4 = 1;
	int a5 = 2;
	int a6 = 3;

	int b1 = 2;
	int b2 = 0;
	int b3 = 5;
	int b4 = 1;
	int b5 = 3;
	int b6 = 1;
	int b7 = 8;
	
	int sum = a1*2 + a2*3 + a3*4 + a4*5 + a5*6 +a6*7 +
			b1*8 + b2*9 + b3*2 + b4*3 + b5*4 +b6*5;
	int rest = sum %11;
	rest = 11 - rest;
	rest = rest%10; // rest %= 10 으로 줄여 쓸 수 있으면 줄여쓰기
	// 복합대입연산자는 줄이는 방법

	if( b7== rest) {
		System.out.println("정상적인 주민번호");
	}else {
		System.out.print("비정상적인 주민번호");
		
	}
	
	System.out.println("체고");
	
	}
}
