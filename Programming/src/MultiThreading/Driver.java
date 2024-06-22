package MultiThreading;

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		P4 ref =new P4();
		P5 t1 =new P5(ref);
		P6 t2 =new P6(ref);
		t1.start();
		Thread.sleep(4000);
		t2.start();
	}
}
