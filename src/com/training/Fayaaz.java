package com.training;

import java.util.Scanner;

/**
 * @author mfayaazu
 *
 */
public class Fayaaz {

	public static int x;
	public static int y;
	public static String operator;

	
	public static void main(String[] args) {
		
		String opetrator1 = scan(operator);
		
		switch (opetrator1) {
		case "+":
			add(x,y);
			break;
		case "-":
			sub(x,y);
			break;
		case "*":
			mul(x,y);
			break;
		case "/":
			div(x,y);
			break;
		case "%":
			abs(x,y);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}	
	}

	static String scan(String operator1) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any one Operation(+,-,*,/,%):");
		operator1 = sc.nextLine();
		System.out.println("Enter X value:");
		x = sc.nextInt();
		System.out.println("Enter Y value:");
		y = sc.nextInt();

		return operator1;
	}
	
	static void add(int x2, int y2){		
		System.out.println("Addition is:"+ (x2+y2));
	}

	static void sub(int x2, int y2){
		System.out.println("Subtraction is:"+ (x2-y2));
	}

	static void mul(int x2, int y2){
		System.out.println("Multiplication is:"+ (x2*y2));
	}

	static void div(int x2, int y2){
		System.out.println("Division is:"+ (x2/y2));
	}
	static void abs(int x2, int y2){
		System.out.println("Remainder is:"+ (x2%y2) );
	}
}
