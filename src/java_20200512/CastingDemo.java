package java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		//형변환(캐스팅)을 하면 에러가 발생하지 않고,
		//대신 circuit 현상 발생(127 다음에 -128로 돌아감)
		byte a = (byte)128;
		System.out.println(a);
		
		//float, double은 값을  정수형으로 형변환 하면 소수점 이하가 잘린다
		//cut 현상이라고 함
		int b = (int)42.5;
		System.out.println(b);
		byte c = (byte)128.5;
		System.out.println(c);
		
		
	}
}
