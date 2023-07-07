package sub3;

public class AddThread extends Add implements Runnable{ //다중상속효과 인터페이스

	private int start;
	private int end;
	
	public AddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		
		for(int k = start; k<=end ; k++) {
			setNum(k);
		}
	}
	
}
