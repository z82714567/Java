package sub1;

public class Apple { // extends Object(암식적으로 상속받는 중)

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
		public String toString() { //객체 속성 출력 메서드(정보조회)
		System.out.println("객체 해시값 : " + hashCode());
		System.out.println("원산지 : " + this.country);
		System.out.println("가격 : " + this.price);
			return super.toString();
		}
	 
}
