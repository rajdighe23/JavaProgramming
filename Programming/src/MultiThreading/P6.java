package MultiThreading;

public class P6 extends Thread {
	P4 ref;
	P6(P4 ref){
		this.ref=ref;
	}
	
	@Override
	public void run() {
		ref.modifyData("SAD");
	}
	
	
}
