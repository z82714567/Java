package sub1;
/**
 * 날짜 : 2023/07/04
 * 이름 : 노수현
 * 내용 : 함수형 프로그래밍 실습하기
 * 
 * 함수형 프로그래밍
 *  - 프로그래밍 단위를 함수 단위로 실행하는 프로그래밍 패러다임
 *  - 함수형 프로그래밍의 함수는 람다식으로 표현
 *  hjhj
 * 
 */
interface A {
	public void method();
}

class B implements A {
	
	public void method() {
		System.out.println("method 실행...");
	}
}


public class FunctionalTest {

	public static void main(String[] args) {
		
		//객체지향 방식(보편적 일반적인 방법)
		A a1 = new B();
		a1.method();
		
		//인터페이스를 바로 객체로 생성 (익명클래스-버튼의 클릭 이벤트를 처리 시 주로 사용)
		A a2 = new A() {
			
			@Override
			public void method() {
				System.out.println("method 실행...");
			}
		};
		
		a2.method();
		
		//함수형 프로그래밍 방식(람다식)
		A a3 = () -> {System.out.println("method 실행...");};
		a3.method();
	}
}
