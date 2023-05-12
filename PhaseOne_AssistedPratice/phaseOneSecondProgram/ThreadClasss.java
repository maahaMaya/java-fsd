package phaseOneSecondProgram;

public class ThreadClasss extends Thread {

	public void checkThread(){  
		System.out.println("thread class is running...");  
	} 
	
	public static void main(String[] args) {
		//ThreadClass is called
		ThreadClasss threadClasss = new ThreadClasss();
		threadClasss.start();
	}

}
