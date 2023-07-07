package sub3;

public class Car {
	//속성
	private String name;
	private String color;
	private int speed;
	
	//클래스 변수(정적 변수)
	public static int count;
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	//클래스 메서드(정적 메서드)
	public static int getCount() {
		return count;
	}
	
	
	//기능
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
