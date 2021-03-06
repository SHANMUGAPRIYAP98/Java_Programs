package com.srm.basics;

import java.util.Scanner;

class MathOperation {
	boolean flag = false;
    int sum=0;
    int digits=0;
	void isPrimeNumber(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.println(number + " is not prime number");
				flag = true;
				break;
			}
		}
		if (number == 1) {
			System.out.println(number + " is neither a prime number nor a composite number");
		} else if (flag == false) {
			System.out.println(number + " is prime number");
		}
	}

	int sumOfDigits(int no)
	{
		while(no!=0)
		{
			digits=no%10;
			sum=sum+digits;
			no=no/10;
		}
		return sum;
	}
}

public class BasicOperations {

	public static void main(String[] args) {
		System.out.println("\nEnter the Operation : " + "\n1.Prime Number" + "\n2.Checking Sum of Digits");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		MathOperation mathOp = new MathOperation();
		switch (op) {
		case 1:
			System.out.println("Enter the Number : ");
			int num = sc.nextInt();
			mathOp.isPrimeNumber(num);
			break;
	    case 2:
				System.out.println("Enter the Number : ");
				int number=sc.nextInt();
				int result=mathOp.sumOfDigits(number);
				System.out.println("Sum of Digits : "+result);
				break;
	    default:System.out.println("Invalid Operation");
		}

	}

}
