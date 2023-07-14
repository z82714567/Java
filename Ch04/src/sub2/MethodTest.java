package sub2;
/**
 * 날짜 : 2023/06/15
 * 이름 : 노수현
 * 내용 : Java 매서드 실습하기
 * 
 * 메서드
 *  - 자주 사용하는 코드로직을 모듈화한 구조체
 *  - 메서드에서 선언한 변수는 지역변수이고 해당 메서드가 종료되면 메모리에서 소멸
 * 
 */
public class MethodTest {
	
	//전역변수
	int num = 1; 
	
	

	// main method :프로그램 진입점
	public static void main(String[] args) {
		
		// 매서드 호출
		int y1 = f(1);
		
		int y2 = f(2);
		
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
		// 매서드 지역변수와 스택
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
	}
	
	// 매서드 정의
	public static int f(int x) {
		
		int y = 2 * x + 3;
		return y;
	}
	
	// 매서드 정의 
	public static int sum(int start, int end) {
		
		//지역변수(매서드가 종료되면 스택(메모리)에서 해제됨)
		int total = 0;
		
		for(int k=start ; k <=end ; k++) {
			total += k;
		}
			
		return total;
	}
		
	
	
}
