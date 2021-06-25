package com.srm.oops;

class Point
{
	private int x,y;
	public Point()
	{
		this.x=x;
		this.y=y;
	}
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void distance(Point p1,Point p2)
	{
		int point1=p1.x*p1.y;
		int point2=p2.x*p2.y;
		System.out.println("Point P1 : "+point1);
		System.out.println("Point P2 : "+point2);
		System.out.print("Distance between P1 and P2 : "+(point2-point1));
	}
}
public class PointDemo {

	public static void main(String[] args) {
		Point p=new Point();
		Point p1=new Point();
		p1.setX(10);
		p1.setY(30);
		Point p2=new Point();
		p2.setX(20);
		p2.setY(40);
		p.distance(p1, p2);
	    
	}

}
