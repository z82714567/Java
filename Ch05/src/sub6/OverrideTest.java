package sub6;

/**
 * 날짜 : 2023/06/21
 * 이름 : 노수현
 * 내용 : Java 오버라이드 실습하기
 * 
 * 오버라이드(메서드 재정의)
 *  - 부모클래스의 메서드를 자식클래스에서 재정의 하는 문법
 *  - 오버라이드 기능을 통해 객체 지향 프로그래밍의 다형성이라는 문법 기능을 구현함
 *  
 */

class AAA{
	
	public void method1() {
		System.out.println("AAA::method1...");
	}
	public void method2() {
		System.out.println("AAA::method2...");
	}
	//method3 (매개변수가 다 다름) Overload
	public void method3() {
		System.out.println("AAA::method3...");
	}
}



class BBB extends AAA{
	
	@Override // AAA의 method2를 재정의
	public void method2() {
		System.out.println("BBB::method2...");
}
	//method3 (매개변수가 다 다름) Overload
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}
}	


class CCC extends BBB{
	
	@Override // AAA의 method1를 재정의
	public void method1() {
		System.out.println("CCC::method1...");
	}
	@Override // BBB의 method2를 재정의
	public void method2() {
		System.out.println("CCC::method2...");
	}
	//method3 (매개변수가 다 다름) Overload
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
}

}

public class OverrideTest {

	public static void main(String[] args) {
		//오버라이드 메서드 호출
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1,2);
		
		
		//Car 상속객체 생성
		Sedan sonata = new Sedan("소나타","흰색", 0, 2000);
		Truck bongo = new Truck("봉고","남색", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedUp(80);
		bongo.show();
	}
}
