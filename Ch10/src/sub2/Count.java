package sub2;



public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	//동기화 블럭 : 스레드간의 경합을 막고 동기방식으로 실행
	public synchronized void setNum() { //스레드3개 진입(동시진행 가능) ->스레드 하나가 끝날 때까지 진입 막기(동기화)
		this.num++;
	}
	
}
