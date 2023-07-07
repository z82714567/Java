package test4;
/**
 * 날짜 : 2023/06/30
 * 이름 : 노수현
 * 내용 : 문자열 처리 연습문제
 */
public class Test03 {
	
	public static void main(String[] args) {
		
		String fileName = "자바 프로그래밍.pdf";
		
		int idx = fileName.lastIndexOf("."); //indexOf 앞에서부터 찾기임, lastIndexOf 확장자를 찾으려면 끝에서부터
		
		String title = fileName.substring(0, idx); //메서드 자르기(이상,미만)
		String ext = fileName.substring(idx+1); //ext확장자(인덱스.값+1뒤부터 p부터끝까지 끝은안적음)
		
		System.out.println("파일명 : " +title);
		System.out.println("확장자 : " +ext);
		
		
	}

}
