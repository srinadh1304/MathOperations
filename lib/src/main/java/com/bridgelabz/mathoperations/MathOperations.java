package com.bridgelabz.mathoperations;

@FunctionalInterface
interface MathFunctionIF{
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, MathFunctionIF functionObject) {
		System.out.println("Result of  " +function+" is "+functionObject.calculate(a,b));
	}
}

public class MathOperations{
	
	public static void main(String[] args) {
		
		MathFunctionIF add = Integer::sum;
		MathFunctionIF subtract = (int a, int b) -> a-b;
		MathFunctionIF multiply = (int a, int b) -> a*b;
		MathFunctionIF divide = (int a, int b) -> {
			if(b==0)return 0;
			return a/b;
		};
		MathFunctionIF.printResult(6, 3, "Addition", add);
		MathFunctionIF.printResult(6, 3, "SUbtraction", subtract);
		MathFunctionIF.printResult(6, 3, "Multiplication", multiply);
		MathFunctionIF.printResult(6, 0, "Division", divide);

	}

}