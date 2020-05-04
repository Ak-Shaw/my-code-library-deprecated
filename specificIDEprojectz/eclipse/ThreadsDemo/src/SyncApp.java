class Printer{
//	synchronized void printDocuments(int numOfCopies, String docName) {
	void printDocuments(int numOfCopies, String docName) {
		for(int i=1;i<=numOfCopies;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing "+docName+" "+i);
		}
	}
}

class MyThread extends Thread{
	
	Printer pRef;
	
	public MyThread(Printer pRef) {
		this.pRef = pRef;
	}

	@Override
	public void run() {
		synchronized(pRef) {
			pRef.printDocuments(10, "John's Profile");
		}
	}
}

class YourThread extends Thread{
	
	Printer pRef;
	
	public YourThread(Printer pRef) {
		this.pRef = pRef;
	}

	@Override
	public void run() {
		synchronized(pRef) {
			pRef.printDocuments(10, "Fiona's Doc");
		}
	}
}

public class SyncApp {
	
	//main is representing the main thread
	public static void main(String[] args) {
		
		System.out.println("==Application started==");
		
		//we have only one single object of Printer
		Printer printer=new Printer();
		
		// scenario is that we have multiple threads working
		// on the same Printer object
		// if multiple threads are going to work on the same single 
		// object, we must synchronize them.
		MyThread mRef=new MyThread(printer); // MyThread is having reference to the Printer Object
		YourThread yRef=new YourThread(printer);// YourThread is having reference to the Printer object
		
		mRef.start();
		
//		try {
//			mRef.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		yRef.start();
		
		System.out.println("==Application ended==");
		
	}

}
