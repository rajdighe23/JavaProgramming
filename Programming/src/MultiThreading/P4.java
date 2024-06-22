package MultiThreading;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P4 {
	String data = "Happy";
	String path = "";

	public void writeIntoFile() throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Raj\\Desktop\\JavaRevision\\OneToOne.txt");
		PrintWriter pw = new PrintWriter(fos);
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			pw.write(ch);
			System.out.println("Writing");
			Thread.sleep(1000);
		}
		pw.flush();
	}
	public void modifyData(String data) {
		this.data=data;
	}
}
