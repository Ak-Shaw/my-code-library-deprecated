import java.util.*;
import java.io.*;
class EvaluateExpression {

	public static Long evaluateExpression(Long n , ArrayList<String> expression) {

		Stack<Long> stack = new Stack<Long>();

		for (int i = 0; i < n; i++) {

			String element = expression.get(i);

			if (!isOperator(element)) {
				stack.push(Long.parseLong(element));
			} else {
				Long operand2 = stack.pop();
				Long operand1 = stack.pop();
				Long result = eval(operand1, operand2, element.charAt(0));
				stack.push(result);
			}
		}

		Long answer = stack.pop();
		return answer;
	}

	public static Long eval(Long a, Long b, char ch) {

		if (ch == '+')
			return (a + b);
		else if (ch == '-')
			return (a - b);
		else if (ch == '/')
			return (a / b);
		else 
			return (a * b);
	}

	public static boolean isOperator(String ch) {

		char c = ch.charAt(0);
		return ch.length() == 1 && (c == '/' || c == '*' || c == '+' || c == '-');
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Long n = sc.nextLong();
		ArrayList<String> A = new ArrayList<String> ();
		for ( int i = 0; i < n; i++) {
			String s = sc.next();
			A.add(s);
		}
		Long answer = evaluateExpression(n, A);
		System.out.print( answer + " ");
	}
}
