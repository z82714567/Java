package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 노수현
 * 내용 : Java 문자 스트림 실습하기
 * 
 * 문자스트림
 *  - 아시아권 문자를 위한 문자 전용 스트림
 *  - 유니코드 기반으로 UTF-8(인코딩기법) 인코딩 처리로 아시아권 문자 인코딩 처리 
 */
public class ReaderTest {

	public static void main(String[] args) {
		// 샘플1 위치
		String path = "C:\\Users\\Java\\Desktop\\Sample1.txt";
		// 샘플1 -> 2 가상의 파일 복사 
		String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		try {
			// 문자 스트림 연결
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter(target);
			while(true) {
				
				// 파일 읽기
				int data = fr.read(); 
				
				if(data == -1) {
					// 파일을 모두 읽었을 때 반복종료
					break;
				}
				
				// int는 char로 캐스팅 가능
				char ch = (char) data; 
				System.out.print(ch); // 출력 한글 변환 불가능 
				
				// 파일 쓰기
				fw.write(data);
				
			}
			
			fr.close(); // 파일 다 읽었으면 스트림 해제
			fw.close(); // 파일 다 만들었으면 스트림 해제 
		} catch (FileNotFoundException e) { //Exception으로 상속받으니까 
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		System.out.println("프로그램 종료 ...");
	} // main 종료
	
}
