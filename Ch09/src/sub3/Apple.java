package sub3;

import java.io.Serializable;

public class Apple implements Serializable {

	private static final long serialVersionUID = 1L; // 모든 Class는 UID를 갖는데 Class내용이 변경되면 UID값 역시 바뀜. 다른 Class로 인식할까봐 방지를 위해 미리 UID선언해줌
	private String country;
	private int pirce;
	
	public Apple(String country, int price) {
		this.country = country;
		this.pirce = price;
		
		
	}
	
	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + pirce);
	}
	
}
