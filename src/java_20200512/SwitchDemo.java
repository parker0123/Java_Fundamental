package java_20200512;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		
		//switch 문:
		//char byte short int 의 자료형만 가능
		//break를 만나면 빠져나가는 역할
		//만약 브레이크가 없다면 아래로 내려감
		//각각 케이스는 유일해야 함(중복 불가)
		//디폴트 문을 중간에 넣어도 됨
		
		
		//month => 수식(char, byte, short, int, String)
		switch(month) {
		//case 평가값 => 반드시 유일해야 함.
		
		//절에 break가 없으면 아래 case로 넘어감.
		//마지막 문장에 break문은 필요 없음 but 다른 곳에 있을 경우
		//break문을 사용해야 함.
		case 12 : 
		case 1: 
		case 2: season = "겨울"; break;
		case 3: 
		case 4: 
		case 5: season = "봄"; break;
		case 6: 
		case 7: 
		case 8: season = "여름"; break;
		case 9: 
		case 10: 
		case 11: season = "가을"; break;
		default: season = "없는 게절"; break;
		}
		
		System.out.println(month+"월은 "+season+"입니다.");
	}
	
}
