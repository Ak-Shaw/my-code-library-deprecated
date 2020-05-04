//class MyTask{
//	
//	void executeTask() {
//		
//		for(int doc=1;doc<=10;doc++) {
//			System.out.println("@@ printing document #"+doc+"printer 2");
//		}
//
//	}
//}

// MyTask IS-A Thread
//class MyTask extends Thread{
//	
//	@Override
//	public void run() {
//		
//		for(int doc=1;doc<=10;doc++) {
//			System.out.println("@@ printing document #"+doc+" printer 2");
//		}
//
//	}
//}


class CA{
	
}

class  MyTask extends CA implements Runnable{
	
	
	@Override
	public void run() {
		
		for(int doc=1;doc<=10;doc++) {
			System.out.println("@@ printing  document #"+doc+" printer 2");
		}
	}
}

class  YourTask extends CA implements Runnable{
	
	
	@Override
	public void run() {
		
		for(int doc=1;doc<=10;doc++) {
			System.out.println("** printing  document #"+doc+" printer 3");
		}
	}
}


public class App {
	
	// main method represents main thread
	public static void main(String[] args) {
		
		// whatever we write in here will be executed by main thread
		// threads always execute the job in a sequence
		
		//job1
		System.out.println("==Application started==");
		
//		//job2
//		MyTask task=new MyTask();
//		//task.executeTask();
//		task.start();// -> start shall internally execute run method

		Runnable r=new MyTask();// polymorphic statement
		Thread task=new Thread(r);
		task.start();
		
//		Thread yourTask=new Thread(new YourTask());
//		yourTask.start();
		new Thread(new YourTask()).start();
		
		// till job 2 is not finished, below written jobs are waiting and not executed
		// in case job2 is a long running operation, i.e. several documents are supposed
		// to be printed
		// in such a case OS/JVM shall give a message that app is not responding
		// some sluggish behavior in app can be observed -> app seems to hang
		
		// Now main and MyTask are executing parallelly or concurrently! 
		// technically the statements after task.start() are runnig parallelly 
		// with task.start()
		
		//job3
		for(int doc=1;doc<=10;doc++) {
			System.out.println("^^printing document #"+doc+" printer 1");
		}
		
		//job4
		System.out.println("==Application ended==");
	}

}
