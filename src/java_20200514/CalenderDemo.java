package java_20200514;

public class CalenderDemo {
	public static void main(String[] args) {

		/*
		 * 달력만들기 1. 1년 1월 1일 월요일 2. 1년= 365일, 윤년 = 366일 3. 윤년은 4년마다 발생, 100의 배수는 제외,
		 * 400의 배수 포함 4.
		 */

		int year = 2020;
		int month = 5;
		int day = 14;
		int totalCount = 0;
		int rest = 0;
		int yearRest4 = year % 4;
		int yearRest100 = year % 4;
		int yearRest400 = year % 4;
		String message = null;

		int preyear = year - 1;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// monthArray 배열에서 year이 윤년인지 아닌지를 판단 후, 윤년의 경우 두 번째 값을 29로 변경하기

		if (yearRest4 == 0 || yearRest400 == 0 && yearRest100 != 0) {
			monthArray[1] = 29;
		}
		;
		System.out.println(monthArray[1]);

		/* boolean 이용하기 (true false)
		 * boolean leafYear = year%4==0 && year%100!=0 || year%400==0;
		 * if(leafYear) 
		 * ???????????????????????????????
		 */
		
		
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];

		}
		System.out.println(totalCount);

		totalCount += preyear * 365 + (preyear / 4 - preyear / 100 + preyear / 400);
		rest = totalCount % 7;

		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else if (rest == 7) {
			message = "일요일";
		}

		System.out.println("오늘은" + " " + year + "년" + month + "월" + day + "일" + message + "입니다.");
		System.out.println(year + "년" + month + "월" + day + "일은" + message + "입니다");

	}
}
