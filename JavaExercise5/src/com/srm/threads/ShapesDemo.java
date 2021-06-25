package com.srm.threads;

class Shapes extends Thread
{
	final static double PI=3.14;
	double r=5.0;
	double b=10,h=20,cir,tri;
	double circleArea(double r)
	{
		return this.PI*Math.pow(r, 2);
	}
	double triangleArea(double b,double h)
	{
		return 0.5*b*h;
	}
	public void run()
	{
		System.out.println("Current Thread : "+Thread.currentThread().getName());
		cir=circleArea(r);
		System.out.println("Area of Circle : "+cir);
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tri=triangleArea(b, h);
		System.out.println("Area of Triangle : "+tri);
	}
}

public class ShapesDemo {

	public static void main(String[] args) {
		
		Shapes s=new Shapes();
		s.start();
		System.out.println("Thread 1 : "+s.isAlive());
		try {
			s.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Shapes s1=new Shapes();
		s1.start();
		try {
			s1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 2 : "+s1.isAlive());
	}

}
