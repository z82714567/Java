package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 노수현
 * 내용 : 싱글톤 객체 연습문제
 */
class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name; //3
		this.price = price;
	}
	
	public void info() {
		System.out.println("=============="); //2
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("--------------");
	}
}

class CarFactory{ // 싱글톤객체
	private static CarFactory instance = new CarFactory(); //4
	private CarFactory() {}
	
	public static CarFactory getInstance() { //2
		return instance; //3
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price); //2
	}
}

public class Test05 {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); //1 // = new CarFactory 
		Vehicle avante = factory.createCar ("아반테", 2500); //1
		Vehicle sonata = factory.createCar("소나타", 3000); 
		
		avante.info(); //1
		sonata.info();
		
	}
	
}
