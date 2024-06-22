package MultiThreading;

public class Driver1 extends Thread{
	P7 ref1 =new P7();
	P8 ref2 = new P8();
	
	@Override
	public void run() {
		ref1.demo1(ref2);
	}
	public void m1() {
		start();
		ref2.demo2(ref1);
	}
	
	public static void main(String[] args) {
		Driver1 d1=new Driver1();
		d1.m1();
	}
}
