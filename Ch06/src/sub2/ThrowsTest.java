package sub2;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/26
 * 이름 : 노수현
 * 내용 : Java Throws 실습하기
 */
public class ThrowsTest {
	
	public static void main(String[] args) { //예외 처리
	
	try {
		myMethod1(10);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("프로그램 정상 종료...");
	}

	public static void myMethod1(int n1) throws Exception { //myMethod1 호출한 곳으로 예외 던지기
		myMethod2(n1);
	}
	
	public static void myMethod2(int n1) throws Exception { //myMethod2 호출한 곳으로 예외 던지기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n2 입력 : ");
		int n2 = scan.nextInt(); //InputMismatchException 발생 가능
		int result = n1 / n2; //ArithmeticException 발생 가능
		
		System.out.println("result : " + result);
		
		scan.close();
	}
	
	
	
}
