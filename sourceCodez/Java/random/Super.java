// example of super keyword implementation

class SuperClass{//parent class aka super class

	public void printMethod(){
		System.out.println("Printed in SuperClass");
	}
}

class SubClass extends SuperClass{

	//overrides method from parent
	@Override
	public void printMethod(){
		super.printMethod();// calls method in SuperClass (parent)
		System.out.println("Printed in SubClass");
	}
}

class MainClass{

	public static void main(String[] args) {
		SubClass s=new SubClass();
		s.printMethod();
	}
}