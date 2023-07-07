package sub4;
/**
 * 날짜 : 2023/06/27
 * 이름 : 노수현
 * 내용 : Java Math 클래스 실습하기
 */
public class MathTest {

	public static void main(String[] args) {
		
		//Math math = new Math(); 객체생성불가, 정적변수, 싱글톤은 아님
		
		//기본메서드
		System.out.println("절대값 : " + Math.abs(-5) );
		System.out.println("제곱근 : " + Math.sqrt(9) );
		System.out.println("올림값 : " + Math.ceil(1.2) );
		System.out.println("올림값 : " + Math.ceil(1.8) );
		System.out.println("내림값 : " + Math.floor(1.2) );
		System.out.println("내림값 : " + Math.floor(1.8) );
		System.out.println("반올림 : " + Math.round(1.2) );
		System.out.println("반올림 : " + Math.round(1.8) );
		
		//random 임의의 난수 구하기
		double num1 = Math.random();
		System.out.println("num1 : " + num1); // 0~1사이의 실수 구하기 
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0~10사이의 실수 구하기
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 1~10사이의 정수 구하기
		
		//1~45 사이의 정수 구하기 (중첩코드) 
		int rand =(int) Math.ceil(Math.random() * 45);
		System.out.println("rand : " + rand);
	}
}
