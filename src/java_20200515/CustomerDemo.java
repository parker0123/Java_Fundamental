package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {

		// 클래스 객체 생성
		// Customer => '타입'
		// c1 => 변수(레퍼런스)
		// new Customer() => 객체를 생성하는 중임. 이때 타입(Customer)과 일치시켜야 함.

		Customer c1 = new Customer(); //c1은 name, email, phone, ..., isReleased 의 객체가 생성됨
			// 변수 할당
		c1.name="성영한";
		c1.email="syh@hbilab.org";
		c1.phone = "010-3024-1703";
		c1.balance = 1_000_000; 
		c1.isReleased=false; // 탈퇴하지 않았다는 뜻

		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);
		
		Customer c2 = new Customer();// c2에도 마찬가지로 name, email, phone ... 등의 객체가 생성됨.
		//이때 c2 레퍼런스들에 있는 객체들과 c1의 객체들은 개별적인 것임. c1과  c2의 공간이 다르다고 생각.
		//
		c2.name = "손정의";
		c2.email="son@dfjalf";
		c2.phone="010-2929-2020";
		c2.balance = 1 ;
		c2.isReleased=false;
		
		Customer c3 = c2; //레퍼런스 형식입
		c3.name = "수정";
	
		System.out.println(c2.name); //c3를 바꾸면 c2도 바뀜
		
	}
}
