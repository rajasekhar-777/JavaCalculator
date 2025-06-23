package com.Calculator;

import java.util.Scanner;

public class ConsoleCalculator {

	public static double Addition(double a, double b) {
		return a + b;
	}

	public static double Subtraction(double a, double b) {
		return a - b;
	}

	public static double Multiplication(double a, double b) {
		return a * b;
	}

	public static double Division(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean status = true;

		while (status) {
			System.out.println("\n... Java Console Calculator");
			System.out.println("Enther the first number:");
			double num1 = sc.nextDouble();
			System.out.println("Enter the second number:");
			double num2 = sc.nextDouble();

			System.out.println("Choose operation(+,-,*,/):");
			char operation = sc.next().charAt(0);
 
			double result;
			
			switch(operation) {
			      
			case '+':
				result = Addition(num1,num2);
				break;
			case '-':
				result = Subtraction(num1,num2);
				break;
			case '*':
				result = Multiplication(num1,num2);
				break;
			case '/':
				result = Division(num1,num2);
				break;
			default:
			     System.out.println("Invalid operation.");
			     continue;
			
			}

			
			System.out.println("Result:" +result);
			System.out.println("Do you perform another calculation ?(Yes/No):");
			String answer = sc.next();
			if(!answer.equalsIgnoreCase("yes")) {
				status = false;
				System.out.println("Calculator exited");
			}
		}
		sc.close();

	}

}
