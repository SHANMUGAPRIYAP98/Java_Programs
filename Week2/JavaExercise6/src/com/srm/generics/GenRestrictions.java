package com.srm.generics;

public class GenRestrictions<T> {
private T t;
public void setType(T t)
{
	this.t=t;
}
public T getType()
{
	return t;
}
public <U extends Number> void find(U u){
    System.out.println("T: " + t.getClass().getName());
    System.out.println("U: " + u.getClass().getName());
}
	public static void main(String[] args) {
		GenRestrictions<Integer> data = new GenRestrictions<Integer>();
        data.setType(new Integer(10));
       //data.find("hello world"); // error: this is still String!

	}

}
