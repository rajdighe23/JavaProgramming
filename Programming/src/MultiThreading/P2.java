package MultiThreading;

public class P2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		P2 ref1 =new P2();
		P2 ref2 =new P2();
		P2 ref3 =new P2();
		ref1.setName("Apple");
		ref2.setName("Mango");
		ref3.setName("Grape");
		ref1.start();
		ref2.start();
		ref3.start();
	}
}
