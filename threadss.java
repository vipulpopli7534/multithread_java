package asg13;

public class threadss extends Thread{
	
	int i=1;
	public synchronized void run() {
	  while(i<=500){
		 System.out.println("1st thread="+i);
		 i++;
	  }
	  try {
		  Thread.sleep(100);
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }

	}

	public static void main(String[] args) throws InterruptedException {
      threadss task1=new threadss();
      Thread t1=new Thread(task1);
	   Task2 task2=new Task2();
	   Thread t2=new Thread(task2);
	   t1.start();
	   t1.join();
	   t2.start();
	   t2.join();

	}

}
class Task2 implements Runnable{
	int i=501;
	public synchronized void run() {
	while(i<=1000){
			System.out.println("2ndthread="+i);
			i++;
		}
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
