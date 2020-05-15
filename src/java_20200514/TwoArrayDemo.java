package java_20200514;

public class TwoArrayDemo {
public static void main(String[] args) {
	
//배열 선언과 생성
	int [ ]a[ ] = new int[3][2];
	// [][]a, a[][]꼴 다 가능
	
	//배열 할당
	a[0][0]=10;
	a[0][1]=30;
	a[1][0]=60;
	a[1][1]=20;
	a[2][0]=40;
	a[2][1]=90;
	
	/*혹은 이하처럼 해도 됨.
	 * 이는 배열 선언과 생성과 할당을 동시에 한 것.
	int[][]a= {{10,30}, {60,20}, {40,90}};
	*/
	int[][]b= {{10,30}, {60,20}, {40,90}};
	
	
	//배열 출력
	for(int i =0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			System.out.println(a[i][j]);
			
		}
	}
	

	
	
}
}
