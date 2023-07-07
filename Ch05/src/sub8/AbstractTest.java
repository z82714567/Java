package sub8;

/**
 * 날짜 : 2023/06/22
 * 이름 : 노수현
 * 내용 : Java 추상클래스 실습하기
 * 
 * 추상클래스(Abstract Class)
 *  - 일반 클래스를 정의하기 위한 기본 틀을 제공하는 클래스
 *  - 추상클래스를 상속 받아 자식클래스에서 미완성 메서드(추상메서드)를 완성(다형성 활용)
 *
 * 
 */


public class AbstractTest {
	
	public static void main(String[] args) {
		
		//추상클래스 객체 생성 불가능
		//Car car = new car("","",0);
		
		//다형성 적용(car) 추상클래스 
		Car sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo = new Truck("봉고","남색",0,0);
		bongo.speedUp(80);
		bongo.speedDown(60);
		bongo.show();
		
	}

}