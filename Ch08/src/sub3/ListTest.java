package sub3;

import java.util.ArrayList;
import java.util.List;



/**
 * 날짜 : 2023/06/28
 * 이름 : 노수현
 * 내용 : Java 자료구조 리스트 실습하기
 * 
 * List
 *  - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
 *  - List를 구현한 ArrayList
 */

public class ListTest {

	public static void main(String[] args) {
		// List 생성
		List<Integer> list = new ArrayList<>(); //List 다형성 적용해서 
		
		// 데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list); // list의 toString 호출
		
		// 1번 인덱스 자리에 6 삽입(추가)
		list.add(1,6); 
		System.out.println(list);
		
		// 2번 인덱스 자리 원소 제거
		list.remove(2); 
		System.out.println(list); 
		
		// 데이터 출력
		System.out.println("list 1번째 원소 : " + list.get(0)); // 인덱스 0자리
		System.out.println("list 2번째 원소 : " + list.get(1)); // 인덱스 1자리
		System.out.println("list 4번째 원소 : " + list.get(3)); // 인덱스 3자리
		
		// 리스트 크기
		System.out.println("list 크기 : " + list.size()); 
		
		// 리스트 반복문
		for (int num : list) { //박싱된 list 값을 Auto-unboxing 처리
			System.out.println(num);
		}
		
		// 문자열 리스트
		List<String> people = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		// 객체(클래스파일의 자료형 = 클래스의 속성을 갖는 자료구조) 리스트
		List<Apple> apples = new ArrayList<>(); 
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본", 1000)); // add에 바로 생성하는 법 
		
	
		Apple apple = apples.get(0);
		apple.show();
		
		apples.get(1).show(); //연속메서드 출력
		apples.get(2).show();
		
		
		
	}
}
