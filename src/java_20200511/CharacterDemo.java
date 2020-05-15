package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		
		char c1 = '\uBC15';
		char c2 = '\uC218';
		char c3 = '\uBE48';
		//문자는 ''안에 넣어준다
		// 유니코드는  저런 식으로 표현
		//아스키코드: 65는 A, 97은 a
		// 48~57 => 0~9
		//65~90 => A-Z
		//97~122 => a~z
		//문자는 '문' 방식.
		//캐릭터 리터럴은 세 가지가 있다. 문자, 유니코드, 아스키코드 종류.
		
		
		//홀따옴표'와 역슬래쉬 \는 캐릭터에서 ㅍ현을 못한다.
		//따라서 이 두 경우에는 앞에 역 슬래쉬를 붙인다
		//쌍따옴표는 '"'식으로 표현 가능
		
		// char이든 스트링이든 홀따옴표, 쌍따옴표, 역슬래쉬는 인식시키려면 문자 앞에 역슬래쉬를 붙인다. 고 생각
		// escape character 세가지를 홀따옴표, 쌍따옴표, 역슬래쉬. 문자로 인식시켜주기 위해
		// 이런 조치를 취하는 것.
	
		char c6 = '\\';
		
		//\t
		//\n
		//\r
		//위 세 가지는 외우자. 
		
		System.out.println("aa" + '\t'+"bb");
		System.out.println("aa" + '\n'+"bb");
		System.out.println("aa" + '\r'+"bb");
		
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		
		
	}
}
