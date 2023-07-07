package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; //Date클래스 설정하면 자동 선언됨

/**
 * 날짜 : 2023/06/27
 * 이름 : 노수현
 * 내용 : Java Date 클래스 실습하기
 */
public class DateTest {
	
	public static void main(String[] args) {
		
		//Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		
		//Calendar 클래스
		Calendar cal = Calendar.getInstance();
		
		int year =cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH) + 1; //1월이 0부터 시작해서 +1 해줌
		int d    =cal.get(Calendar.DATE);
		int hour =cal.get(Calendar.HOUR_OF_DAY); //24시 기준
		int min =cal.get(Calendar.MINUTE);
		int sec =cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d- %d:%d:%d", year, month, d, hour, min, sec);
		
	}

}
