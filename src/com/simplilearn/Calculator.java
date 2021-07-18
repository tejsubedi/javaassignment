package com.simplilearn;

import java.util.Scanner;

/*
DESCRIPTION

Project objective:

As a developer, write a program to create an arithmetic calculator.
Background of the problem statement:
As a developer, write a Java code to create a calculator to perform the four 
basic arithmetic operations (addition, subtraction, multiplication, and division).

You must use the following:
Eclipse/IntelliJ: An IDE to code for the application
Java: A programming language
Git: To connect and push files from the local system to GitHub
GitHub: To store the application code and track its versions
Core Java concepts: Variables, data types, operators, type casting, control statements, class, objects, access specifiers, and core keywords like final, this, and static
 

Following requirements should be met:

The versions of the code should be tracked on GitHub repositories.
The calculator should work properly.
*/

public class Calculator {
	
	public static void main(String[] args) {
		char operator;
		double num1;
		double num2;
		double result;
		
		Scanner scanner = new Scanner(System.in);
		
		//ask user what operation would like to perform
		System.out.println("Please choose which operator +, -, *, or /  would you like to perform?");
		operator = scanner.next().charAt(0);
		
		//ask user to enter the number
		System.out.println("Enter the first number ");
		num1 = scanner.nextDouble();
		
		System.out.println("Enter the second number ");
		num2 = scanner.nextDouble();
		
		
		if(operator == '+') {
			result = num1 + num2;
			System.out.println("Addition of "+ num1 + " and " + num2 + " is = " + result);
		}else if(operator == '-') {
			result = num1 - num2;
			System.out.println("Subtraction of "+ num1 + " and " + num2 + " is = " + result);
		}else if(operator == '*') {
			result = num1 * num2;
			System.out.println("Multiplication of "+ num1 + " and " + num2 + " is = " + result);
		}else if(operator == '/') {
			result = num1 / num2;
			System.out.println("Division of "+ num1 + " and " + num2 + " is = " + result);
		}else {
			System.out.println("wrong operator. Please enter correct one");
		}
	}
	
}











