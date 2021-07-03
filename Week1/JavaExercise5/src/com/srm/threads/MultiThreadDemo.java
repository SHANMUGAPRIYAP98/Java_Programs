package com.srm.threads;

import java.util.Random;

class ThreadDemo implements Runnable
{
	int value=0;
	double square=0,cube=0;
	void generateNumber()
	{
		Random r=new Random();
		for(int i=0;i<10;i++) {
		value=r.nextInt();
		Thread.currentThread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(value%2==0)
		{
			generateSquare();
		}
		else
		{
			generateCube();
		}
		}
	}
	void generateSquare()
	{
		System.out.println("Random Integer"+"\t"+"Square");
		this.square=Math.pow(this.value,2);
		System.out.println(this.value+"\t"+this.square);
	}
	void generateCube()
	{
		System.out.println("Random Integer"+"\t"+"Cube");
		this.cube=Math.pow(this.value,3);
		System.out.println(this.value+"\t"+this.cube);
	}
	public void run()
	{
		generateNumber();
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		Thread t=new Thread(td);
		t.start();
		ThreadDemo td1=new ThreadDemo();
		Thread t1=new Thread(td1);
		t1.start();

	}

}
