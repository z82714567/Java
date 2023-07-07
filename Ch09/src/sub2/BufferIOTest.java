package sub2;

import java.awt.image.FilteredImageSource;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 날짜 : 2023/06/29
 * 이름 : 노수현
 * 내용 : Java 버퍼 입출력 스트림 실습하기
 * 
 * 보조스트림(버퍼)
 *  - 기본 입출력 스트림에 Buffer를 장착해서 빠른 입출력을 지원하는 보조 스트림
 *
 * 
 */
public class BufferIOTest {

	public static void main(String[] args) {
		String path = "C:\\Users\\Java\\Desktop\\Workspace.zip";
		String target = "C:\\Users\\Java\\Desktop\\Workspace2.zip";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조스트림 (단독실행안돼 fis입,fos출 있어야)
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				int data = bis.read();
				
				if(data == -1) {
					break;
				}
				
				bos.write(data);
			}
			// 스트림 해제
			bis.close();
			bos.flush(); // 버퍼 비우기
			bos.close();
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
