package com.epam.maven_demo;

import java.util.Scanner;

public class Calculator {
	
	public int a;
	public int b;
	
	
	

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
	    System.out.print("Enter two numbers: ");

	    
	   int a = reader.nextInt();
	    int b = reader.nextInt();
	    
	    System.out.print("choose an operator (+, -, *, /) ");
	    char operator = reader.next().charAt(0);

		double result;
		
		Calculator calculator = new Calculator();
		
		switch (operator) {
	      case '+':
	        result = calculator.add(a, b);
	        break;

	      case '-':
	        result = calculator.subtract(a, b);
	        break;

	      case '*':
	        result = calculator.multiply(a, b);
	        break;

	      case '/':
	        result = calculator.divide(a, b);
	        break;

	     
	      default:
	        System.out.printf("Incorrect operator");
	        return;
	    }
		
		System.out.println(a + " " + operator + " " + b + " = " + result);
		

	}
	
	private int add(int a,int b){
		return(a+b);
		
	}
	private int subtract(int a,int b){
		return(a-b);
		
	}
	private int multiply(int a,int b){
		return(a*b);
		
	}
	private int divide(int a,int b){
		return(a/b);
		
	}

}
