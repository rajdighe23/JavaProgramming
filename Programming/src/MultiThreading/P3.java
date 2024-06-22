package MultiThreading;

public class P3 implements Runnable {
	
	@Override
	public void run() {
		for(char i='a';i<='e';i++) {
			System.out.println(i);
			
		}		
	}
	public static void main(String[] args) {
		P3 ref= new P3();
		Thread t1=new Thread(ref);
		Thread t2=new Thread(ref);
		Thread t3=new Thread(ref);
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
