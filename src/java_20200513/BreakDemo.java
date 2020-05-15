package java_20200513;

public class BreakDemo {
public static void main(String [] args) {
	int sum = 0;
	for (int i =1; i<=10; i++) {
		if(i==6) break;
		sum +=i;
	}
System.out.printf("1부터 5까지 합은 %d 입니다. %n", sum);	

//5*5까지만 출력 후 끝내는 구구단 만들기

outter: for(int i = 2; i<=9; i++) {
	for(int j=1; j<=9; j++) {
		if(i==5 && j==6) break outter; 
		//뜻: outter이라는 레이블을 빠져나간다.
		//(break만 쓰면 중괄호만 빠져나감
		//그럴 경우 5*6=30까지 시행 후 다시 6단이 시작됨
		System.out.printf("%d*%d=%d%n", i, j, i*j);
	}
}



}
	
}
