package MultiThreading;

public class P5 extends Thread {
	P4 ref;
	P5(P4 ref){
		this.ref=ref;
	}
	@Override
	public void run() {
		try {
			ref.writeIntoFile();
		} catch (Exception e) {
			System.out.println("Handled");
		}
	}
}
