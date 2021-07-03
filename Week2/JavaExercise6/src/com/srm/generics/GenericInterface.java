package com.srm.generics;

interface OwnInterface<K>
{
	void displayData(K k);
}
class UserClass implements OwnInterface<Integer>
{

	@Override
	public void displayData(Integer k) {
		System.out.println("Power of the is "+k+" : "+Math.pow(k, 2));
		
	}
	
}
public class GenericInterface {

	public static void main(String[] args) {
		UserClass uc=new UserClass();
		uc.displayData(9);

	}

}
