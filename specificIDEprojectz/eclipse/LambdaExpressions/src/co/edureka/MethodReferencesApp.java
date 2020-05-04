package co.edureka;

@FunctionalInterface
interface Calculator{
	void add(int num1, int num2);
}

class CalC{
	public static void addSomething(int num1, int num2) {
		System.out.println(num1+" and "+num2+" addition is : "+(num1+num2));
	}
	
	public void letsAdd(int num1, int num2) {
		System.out.println(num1+" and "+num2+" adds to : "+(num1+num2));
	}
}

@FunctionalInterface
interface Messenger{
	Message getMessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println(">> Message is : "+msg);
	}
}

public class MethodReferencesApp {

	public static void main(String[] args) {

		//CalC.addSomething(10,20);
		
		//1. Refering to a Static Method
		Calculator cRef=CalC::addSomething;//Method Reference
		cRef.add(11, 14);
		
		//2. Reference to a non-static method or Instance Method
		CalC calc=new CalC();//Object Construction Statement for Calc
		Calculator cRef2=calc::letsAdd;
		cRef2.add(12, 23);
		
		//3. Reference to a Constructor
		Messenger mRef=Message::new;//Method Reference
		mRef.getMessage("Search the candle rather than cursing the darkness!!");
	}

}
