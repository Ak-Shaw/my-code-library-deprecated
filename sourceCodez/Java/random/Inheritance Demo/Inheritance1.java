class Parent{

	Parent(){
		System.out.println("Parent class constructor called");
	}
}

class Child extends Parent{

	Child(){
		System.out.println("Child class constructor called");
	}

	public static void main(String[] args) {
		
		Child ob=new Child();
	}
}