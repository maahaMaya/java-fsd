package phaseOneSecondProgram;

public class RunnableInterface implements Runnable {

	public void run(){  
		System.out.println("thread class is running...");  
	}
	
	public static void main(String[] args) {
		// RunnableInterface object is created
		RunnableInterface runnableInterface = new RunnableInterface();
		
		// Using the constructor Thread(Runnable r)
		Thread t1 = new Thread(runnableInterface);
		t1.start();
	}
}
