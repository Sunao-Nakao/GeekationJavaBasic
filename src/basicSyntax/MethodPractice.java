package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		
		int a = 18;
		int b = 3;
		
		int[] calcCodes = {sumNumber(a, b), subtractNumber(a, b), multiplyNumber(a, b), divideNumber(a, b)};
		for (int code: calcCodes) {
			print(code);
		}
		
	}
	
	public static int sumNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subtractNumber(int a, int b) {
		int subtract = a - b;
		
		
		return subtract;
	}
	
	public static int multiplyNumber(int a, int b) {
		int multiply = a * b;
		
		
		return multiply;
	}
	
	public static int divideNumber(int a, int b) {
		int divide = a / b;
		
		
		return divide;
	}
	
	public static void print(int code) {
		System.out.println("計算結果は" + code + "です。");
	}
	
		

}
 