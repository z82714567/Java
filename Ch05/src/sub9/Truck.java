package sub9;
//구현
public class Truck implements Car {

	//속성선언
		private String name;
		private String color;
		private int speed;
		
	//생성자	
		public Truck(String name, String color, int speed) {
			this.name = name;
			this.color = color;
			this.speed = speed;
		}
		
		@Override
		public void speedUp(int speed) {
			this.speed += speed;
		}

		

		@Override
		public void speedDown(int speed) {
			this.speed -= speed;
		}

		@Override
		public void show() {
			System.out.println("차량명 : " + this.name);
			System.out.println("차량색 : " + this.color);
			System.out.println("현재속도 : " + this.speed);
		}


}
