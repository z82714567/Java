package sub5;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 : 2023/06/30
 * 이름 : 노수현
 * 내용 : Java File 클래스 실습하기
 * 
 * 파일 클래스
 * 
 * - File 클래스는 파일에 대한 경로나 정보를 조회할 때 사용하는 클래스
 * - 별도의 입출력 기능이 없어 스트림을 통한 데이터 입출력
 */
public class FileTest {

	public static void main(String[] args) {
		
		//파일 객체 생성
		File f1 = new File("C:\\Users\\Java\\Desktop\\file1.txt"); //(확장자는파일, 없으면 폴더)입출력기능없음 파일생성,파일정보조회만
		File f2 = new File("../../../../../file2"); //폴더생성
		
		
		try {
			//파일 생성
			f1.createNewFile();
			//폴더(디렉터리) 생성
			f2.mkdir();
			
			//파일 구분 확인
			System.out.println("f1 isFile : " + f1.isFile()); //is,has시작하는 메서드는 boolean값을 리턴하는 함수
			System.out.println("f1 isDirectory : " + f1.isDirectory());
			System.out.println("f2 isFile : " + f2.isFile());
			System.out.println("f2 isDirectory : " + f2.isDirectory());
			System.out.println("f1 getName : " + f1.getName()); //이름
			System.out.println("f2 getName : " + f2.getName());
			System.out.println("f1 getAbsolutePath : " + f1.getAbsolutePath()); //절대경로(시스템상의 경로)
			System.out.println("f2 getAbsolutePath : " + f2.getAbsolutePath()); 
			System.out.println("f1 getPath : " + f1.getPath()); //상대경로(현재위치의 경로)
			System.out.println("f2 getPath : " + f2.getPath());
			
			//파일 삭제
			f1.delete();
			f2.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
