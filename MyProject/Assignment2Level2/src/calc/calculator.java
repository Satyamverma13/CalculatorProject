package calc;

import java.util.Scanner;


public class calculator {

public static int add(int num1, int num2) {
	return num1 + num2;
}
public static int sub(int num1, int num2) {
	return num1 - num2;
}

public static int mul(int num1, int num2) {
	return num1 * num2;
}
public static double div(double num1, double num2) {
	if (num2 ==0) {
		throw new IllegalArgumentException("Number cannot be divided by 0");
		}
	return num1/num2;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int input = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Second Number : ");
		int input1 = sc.nextInt();
		
		System.out.println("The Addition is : " + calculator.add(input, input1));
		System.out.println("The Subtraction is : " + calculator.sub(input, input1));
		System.out.println("The Multiplication is : " + calculator.mul(input, input1));
		System.out.println("The Division is : " + calculator.div(input, input1));
	}

}
