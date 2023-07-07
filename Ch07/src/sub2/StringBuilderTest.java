package sub2;
/**
 * 날짜 : 2023/06/27
 * 이름 : 노수현
 * 내용 : Java StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		//String immutable 특성
		String str = "Java"; // Java
		System.out.println("str 객체주소 값 : " + System.identityHashCode(str) );
		
		str += "Programming"; // 힙에 새롭게 생긴 주소값 JavaProgramming
		System.out.println("str 객체주소 값 : " + System.identityHashCode(str) );
		
		System.out.println("str : " + str);
		
		
		//String의 immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java"); // 힙의 하나의 메모리 사용
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));
		sb.append("Programming");
		System.out.println("sb 객체주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
		
	}
}
