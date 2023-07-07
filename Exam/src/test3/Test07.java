package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 노수현
 * 내용 : 클래스 상속 연습문제
 */
class Customer{
		protected int id;
		protected String name;
		protected String grade;
		protected int point;
		protected double pointRatio;
		
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade ="SILVER";
		this.point = 50;
		this.pointRatio = 0.01;
	}	
	
	public int calPrice(int price) {
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("========================");
		System.out.println("고객번호 : " + id);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + grade);
		System.out.println("현재 포인트 : " + point);
		System.out.println("포인트 적립률: " + pointRatio);
		System.out.println("-----------------------");
	}
}

class VipCustomer	extends Customer{
	private double saleRatio;
	
	public VipCustomer(int id, String name) {
		super(id, name); // 부모클래스에 매개변수를 갖는 생성자만 있는 경우 코드 직접 입력
		super.grade = "VIP";
		super.point = 1500;
		super.pointRatio = 0.05;  
		this.saleRatio = 0.1;
	}
	@Override
	public int calPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price * saleRatio);
	}
}
public class Test07 {
	
	public static void main(String[] args) {
		Customer 	kim = new Customer(1001, "김춘추");
		VipCustomer lee = new VipCustomer(1002, "이순신");
		
		System.out.println("김춘추님이 지불할 금액 : " + kim.calPrice(10000));
		System.out.println("이순신님이 지불할 금액 : " + kim.calPrice(9000));
		
		kim.showInfo();
		lee.showInfo();
	}

}
