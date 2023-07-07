package sub8;
//추상클래스
public abstract class Car {

	//속성
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	//추상메서드 - 자식클래스에서 완성해야 함.
	public abstract void speedUp(int speed); 
	public abstract void speedDown(int speed);
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}

	
	
	
	
}
