package sub1;
/**
 * 날짜 : 2023/06/19
 * 이름 : 노수현
 * 내용 : Java Car 클래스 정의
 * 
 *
 */
//Car 클래스 정의
public class Car {
	
	// 추상화(객체의 특성을 뽑아내는 것)
	// 필드(속성) : 변수선언
	String name;
	String color;
	int speed;
	
	// 메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}

