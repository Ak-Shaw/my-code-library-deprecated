package ExceptionEdureka;
import java.util.*;

public class CustomExceptions {

	static void validateInput(int number)throws InvalidInputException{
		
		if(number>100)
			throw new InvalidInputException("Exception");
		
		System.out.println("Valid Input");
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number less than or equal to 100 : ");
		int number=scanner.nextInt();
		try {
			validateInput(number);
		}catch(InvalidInputException e) {
			System.out.println("Caught Exception - Input is greator than 100");
		}
	}
}

class InvalidInputException extends Exception{
	InvalidInputException(String exceptionText){
		super(exceptionText);
	}
}
