package com.srm.threads;

class Fibonacci extends Thread
{
	int a=0,b=0,c=0;
	public void run()
	{
		a=-1;
		b=1;
		System.out.println("Fibonacci Series");
		for(int i=0;i<=5;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
class Fibo implements Runnable
{
	int a=0,b=0,c=0;
	public void run()
	{
		a=-1;
		b=1;
		System.out.println("Fibonacci Series");
		for(int i=0;i<=5;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
public class FibonacciDemo {

	public static void main(String[] args) {
	Fibonacci fb=new Fibonacci();
	fb.start();
	Fibo fb1=new Fibo();
	Thread t1=new Thread(fb1);
	t1.start();
	
	}

}
