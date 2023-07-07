package sub1;
/**
 * 날짜 : 2023/07/03
 * 이름 : 노수현
 * 내용 : Java Thread 실습하기
 * 
 * 스레드(Thread)
 * - 하나의 프로세스 안에서 실행되는 프로그램 실행 흐름
 * - 스레드는 동시에 실행되는 병행 실행
 * - Thread 클래스를 상속받아 start 실행
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		//스레드 객체 생성
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		//자식 스레드 실행
		st1.start(); //병행 실행(main진행10번 되면서 자식스레드1,2도 10번씩 동시 진행)
		st2.start(); //병행 실행
		
		
		for(int i=0; i<10; i++) {
			
			try {
				Thread.sleep(1000); //1초동안 멈춤(스레드 진행 상황을 보기 위해 걸어둠)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
			
		}
		
		System.out.println("Main Thread 종료...");
	}
}
