package com.training;

import java.util.Scanner;

public class Abhinav {

	private static int result = 0;
	private static int value1;
	private static int value2;
	private static String operator;
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scaner = new Scanner(System.in);
		
		System.out.println("please choose an operator(+,-,*,%,/)");
		operator = scaner.next();
		System.out.println("please enter first value");
		try {
			value1 =  scaner.nextInt();
		} catch (Exception e) {
			System.out.println("You have entered unsupported value, by default 0 will be assigned");
		}finally {
			value1 = value1 + 0;
		}
		
		System.out.println("please enter second value");
		try {
			value2 = scaner.nextInt();
		} catch (Exception e) {
			System.out.println("You have entered unsupported value, by default 0 will be assigned");
		}finally {
			value2 = value2 + 0;
		}
		
		result = calculation(operator,value1,value2); 
		System.out.println("Result is : " + result);

	}

	public static int calculation(String operator, int value1,int value2) {
		
		switch (operator) {
		case "+":
			result = value1 + value2;
			break;
		case "-":
			result = value1 - value2;
			break;
		case "*":
			result = value1 * value2;
			break;
		case "%":
			result = value1 % value2;
			break;
		case "/":
			result = value1 / value2;
			break;
		default:
			break;
		}
		
		return result;
	}
}
