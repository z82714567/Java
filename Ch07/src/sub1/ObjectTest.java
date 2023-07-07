package sub1;
/**
 * 날짜 : 2023/06/27
 * 이름 : 노수현
 * 내용 : Java object 클래스 실습하기
 * 
 * Object 클래스
 *  - 자바의 최상위 클래스로 모든 클래스는 Object를 암시적으로 상속 받음
 *  - 주요기능은 객체 비교를 위한 equals(), 객체 정보 조회를 위한 toString() 제공
 *
 */
public class ObjectTest {
	
	public static void main(String[] args) {
		
		// Object 타입으로 다형성 적용 
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("일본", 2000);
		
		// tostring 호출 ,객체의 정보 조회
		System.out.println(a1); 
		a2.toString(); 
		
		// 객체 비교
		if(a1 == a2) {
			System.out.println("a1, a2 주소가 같다.");
		}else {
			System.out.println("a1, a2 주소가 다르다.");
		} // 스택의 주소가 다름
		
		if(a1.equals(a2)) {
			System.out.println("a1, a2가 가리키는 객체가 같다.");
		}else {
			System.out.println("a1, a2가 가리키는 객체가 다르다.");
		} // 힙의 객체가 다름
		
	}

}
