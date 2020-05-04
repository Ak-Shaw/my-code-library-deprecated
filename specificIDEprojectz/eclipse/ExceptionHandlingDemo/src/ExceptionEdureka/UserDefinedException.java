package ExceptionEdureka;

public class UserDefinedException {

	public static void main(String[] args) {
		
		try {
			
			throw new MyException(5);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

class MyException extends Exception{
	
	int a;
	MyException(int b){
		a=b;
	}
	
	public String toString() {
		return("Exception number = "+a);
	}
}
