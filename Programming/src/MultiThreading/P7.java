package MultiThreading;

public class P7 {
	public synchronized void demo1(P8 ref2) {
		System.out.println("Demo1");
		try {
			wait(2000);
		} catch (InterruptedException e) {
			System.out.println("Hi");
		}
		ref2.test1();
	}
	
	public synchronized void test2() {
		System.out.println("Test2");
	}
}
