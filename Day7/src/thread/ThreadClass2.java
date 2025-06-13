package thread;

public class ThreadClass2 extends Thread {
	 @Override
 public void run() {
	
	 for(int i=0;i<100;i++) {
	   	 System.out.println(i);
		}
	 try {
	 Thread.sleep(5000);
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
//	 for(int i=0;i<10;i++) {
//	   	 System.out.println(i);
//		}
	 
 }
}
