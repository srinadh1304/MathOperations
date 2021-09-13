package com.bridgelabz.mathoperations;

@FunctionalInterface
interface MathFunctionIF{
	int calculate(int a, int b);
}

public class MathOperations{
	
	public static void main(String[] args) {
		
		MathFunctionIF add = Integer::sum;
		MathFunctionIF subtract = (int a, int b) -> a-b;
		MathFunctionIF multiply = (int a, int b) -> a*b;
		MathFunctionIF divide = (int a, int b) -> a/b;
		System.out.println("ADDITION: "+add.calculate(10, 4));
		System.out.println("SUBTRACTION: "+subtract.calculate(10, 4));
		System.out.println("MULTIPLICATION: "+multiply.calculate(10, 4));
		System.out.println("DIVISION: "+divide.calculate(10, 4));
		
	}

}