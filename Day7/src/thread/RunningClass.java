package thread;

public class RunningClass {
   //thread 1 Starting procedure
	public static void main(String[] args) {
	ThreadClass tc = new ThreadClass();
	Thread tc1 = new Thread(tc);
	tc1.start();
	
	
	//thread 2 Starting procedure
	ThreadClass2  tc2 = new ThreadClass2();
	tc2.start();
	try {
		tc1.join();
		tc2.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("program completed");
	}

}
