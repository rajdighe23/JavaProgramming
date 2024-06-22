package BasicProgramming;

public class P4 {

	public static void main(String[] args) {
		int dist=200;
		int time =6;
        if(dist<=0 || time<=0)
        {
        	System.out.println("Invalid input");
        }
        else if(dist<250 && time <8)
        {
        	System.out.println(2000);
        }
        else if(dist>250 && time<8)
        {
        	System.out.println(2000 + (dist-250)*20);
        }
        else if(time>8 && dist <250)
        {
        	System.out.println(2000 + (time-8)*100);
        }
        else if(dist>250 && time>8)
        {
        	System.out.println(2000 + (dist - 250)*20);
        }
	}

}
