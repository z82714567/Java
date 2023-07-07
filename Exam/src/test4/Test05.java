package test4;
/**
 * 날짜 : 2023/06/30
 * 이름 : 노수현
 * 내용 : String, Wrapper 클래스 연습문제
 */
public class Test05 {

	public static void main(String[] args) {
		
		String strCsv = "60,72,82,86,92"; //단일 문자열
		String[] scores = strCsv.split(","); //문자열 -> 배열, 구분자(,)를 가지고 쪼갠다
				
		int total = 0;
		
		for(int i = 0; i <scores.length ; i++) {
			
			total += Integer.parseInt(scores[i]); //숫자->문자 타입변환 Integer.parseInt  
		}
		
		System.out.println("총점 : " +total);
	}
}
