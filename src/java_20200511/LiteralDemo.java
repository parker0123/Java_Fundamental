package java_20200511;

public class LiteralDemo {
	public static void main(String[] args) {
		
		byte b4 = 12;
		
		int a1 = 128;
		int a2 = 076; // 8진수: 앞에 제로
		int a3 = 0x123; // 16진수
		int a4 = 0b1010;// 0b: 2진수표기법
		// 주로 10진수를 씀
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long에서는 리터럴에서 숫자 뒤에 l(엘) 또는 대문자 엘로 표기해야 함.
		// 안해도 ㅇㅋ
		long l1 = 12l;
		
		//float의 리터럴 부분에서는 숫자 뒤에 f 또는 F. 
		// ????그렇다면 더블과   float 의 범위 차이는?
		float f1 = 123.4f;
		
		//더블은 d D 혹은 생략 가능
		//따라서 더 간편. 실수연산할 때는 더블을 쓴다
		double d1 = 123.56d;
		
		
		boolean isExisted = false;
		
		//자바에서는 byte끼리 더해버리면 산술연산하면 int로 바뀌어 버림
		// 따라서 캐스팅?)을 할 때 이를 (byte)로 해야 함
		// 여기에 값 범위값도 유의해야 함
		//주로 int를 쓴다
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		
		
				
		
		
		
		
	}
}
