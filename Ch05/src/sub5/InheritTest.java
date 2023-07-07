package sub5;

/**
 * 날짜 : 2023/06/21
 * 이름 : 노수현
 * 내용 : Java 클래스 상속 실습하기
 * 
 * 상속(Inheritance)
 *  - 기존 클래스의 속성과 기능을 그대로 자식클래스에게 확장시키는 프로그래밍 문법
 *  - 공통적인 로직 내용을 부모클래스에 두고 자식클래스에서 상속받아 일관된 프로그래밍 수행함
 *  - 부모클래스의 속성 접근권한을 protected로 변경하고 자식클래스에서 부모 속성을 초기화함
 */

class Parent{
	private int num1; //자식클래스에서 부모클래스의 num1,num2 필드값을 직접 참조하지 않기 때문에 protected 변경 안함.
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
	
	
	
}

class Child extends Parent { //부모클래스 선언
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) { //부모클래스 속성값
		super(num1, num2); // 부모클래스 생성자 호출
		this.num3 = num3;
		this.num4 = num4;
		
	}
	public int minus() {
		return num3 - num4;
	}
	
}






public class InheritTest {

	public static void main(String[] args) {
		
		// 상속객체 생성
		Child c1 = new Child(1,2,3,4);
		int rs1 = c1.plus(); //부모클래스의 plus 기능 사용
		int rs2 = c1.minus();
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);

		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		// Account 상속객체 생성
		StockAccount kb = new StockAccount("kb증권","101-11-1020","홍길동",10000,"삼성전자",10,60000);
		kb.deposit(1000000);
		kb.buy(5, 58000);
		kb.sell(5, 62000);
		kb.show();
		
		
	}
	
}
