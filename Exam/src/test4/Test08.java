package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 날짜 : 2023/06/30
 * 이름 : 노수현
 * 내용 : 로또번호 연습문제
 */
public class Test08 {

	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() { //리턴타입값 찾기
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) { //반복문
			int num = (int) Math.ceil(Math.random()*45);
					
			lottoSet.add(num); //순서상관없고 중복허용x Set
			
			if(lottoSet.size()==6) {
				break;
			}
		}
		// 정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
