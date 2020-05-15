package java_20200514;

public class ArrayDemo {
public static void main (String [] args) {
	
	//1.선언, 생성
	int[] a = new int[4];
	
	//2. 할당
	a[0]= 1;
	a[1]= 2;
	a[2]= 1;
	a[3]= 1;
	
	
	//3.출력
	//a.lenghth: 배열의 길이를 뜻함
	
	for(int i = 0; i<a.length; i++) {
	System.out.println(a[i]);
	}
	
	//배열 선언, 생성, 할당을 동시에
	int [] b= {100, 200,300,40,50};
	
	
	
	//3.
	
	//4.
	
	//배열출력: 
	
	
	//배열출력: enhanced for loop방식
	for(int value : b) {
		System.out.println(value);
	}
	
	
	//배열은 레퍼런스 방식이기에 primitive와 달리 연동된다
	int [] c = a; //a가 가리키는 개체를 c도 참조하라는 뜻.
	c[0]=11;
	
	System.out.println(a[0]);
	System.out.println(c[0]);
	
	/*이하와 비교
	 * primitve는 참조 기능이 없다
	 * 
	 * int a1 = 10;
	 * int b1 = a1;
	 * 
	 *  으로 한 뒤 
	 *  a=15;
	 *  로 하면
	 *  
	 *  b1은 print해도 그대로 10임 (primitive이기때문)
	 */
	
	
	
}
}
