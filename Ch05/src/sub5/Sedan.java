package sub5;

public class Sedan extends Car {
	
	private int cc;

	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); //부모클래스
		this.cc = cc; //자식클래스
	}
	
	public void speedTurbo() {
		//부모클래스 필드 private(캡슐화,내부)에서 protected로 접근권한 변경해서 자식클래스(외부)가 참조함
		this.speed += 20;
	}
	
	public void show() {
		
		super.show(); //부모클래스 show 
		System.out.println("배기량 : " + this.cc);
	}
	
}
