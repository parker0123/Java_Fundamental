package java_20200512;

public class CalenderDemo {

	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일 월요일 2. 1년= 365일, 윤년 = 366일 3. 윤년은 4년마다 발생, 100의 배수는 제외,
		 * 400의 배수 포함 4. 2020년 5월 12일은 무슨 요일인지 * 5. 19년까지의 총일수 + 4월까지 총일수 + 12 ㄷ해서 7로 나눈
		 * 나머지가 1월이면 월요일.. 1년 = 364.24일 (2019*365 +((2019/4 2019/100 + 2019/400))
		 * +31+29+31+30+12)%7
		 */

		int year = 2020;
		int month = 5;
		int day = 12;
		int totalCount = 0;
		int rest = 0;
		String message = null;

		rest = (2019 * 365 + 2019 / 4 - 2019 / 100 + 2020 / 400 + 31 + 29 + 31 + 30 + 12) % 7;

		// 또는 이런 방법도 있음
		int preyear = year - 1;
		totalCount = preyear * 365 + (preyear / 4 - preyear / 100 + preyear / 400);
		totalCount += 31 + 29 + 31 + 30 + 12;
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
