package MultiThreading;

public class P8 {
	public synchronized void demo2(P7 ref1) {
		System.out.println("Demo2");
		try {
			wait(4000);
		} catch (InterruptedException e) {
			System.out.println("Hi");
		}
		ref1.test2();
	}
	
	public synchronized void test1() {
		System.out.println("Test1");
	}
}
