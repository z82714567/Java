package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 노수현
 * 내용 : Java 파일 입출력 스트림(바이트(8비트배열) 스트림) 실습하기
 * 
 * 입출력 스트림(Stream)
 *  - 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행
 *  - 파일 입출력을 위해 스트림(데이터 연결 통로) 사용
 */
public class FileIOTest {

	public static void main(String[] args) {
		// 샘플1 위치
		String path = "C:\\Users\\Java\\Desktop\\Sample1.txt";
		// 샘플1 -> 2 가상의 파일 복사 
		String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		try {
			// 스트림 연결
			FileInputStream fis = new FileInputStream(path); // 예외처리 catch (FileNotFoundException e)
			FileOutputStream fos = new FileOutputStream(target); // 예외처리 catch (IOException e)
			while(true) {
				
				// 파일 읽기
				int data = fis.read(); 
				
				if(data == -1) { // 입력스트림으로부터 바이트를 읽을 수 없다면 read()메소드는 -1을 리턴함.
					// 파일을 모두 읽었을 때 while문 종료
					break;
				}
				
				// 숫자 -> 문자 // int는 char로 캐스팅 가능
				char ch = (char) data; 
				System.out.print(ch); // 출력 한글 변환 불가능 
				
				// 파일 쓰기
				fos.write(data);
				
			}
			
			fis.close(); // 파일 다 읽었으면 스트림 해제
			fos.close(); // 파일 다 만들었으면 스트림 해제 
		} catch (FileNotFoundException e) { //Exception으로 상속받으니까 예외처리2 -> 1
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		System.out.println("프로그램 종료 ...");
	} // main 종료
	
}
