package com.srm.expection;

public class BasicPayExec extends Exception{
	double bpay;
public BasicPayExec(double bpay) {
	super();
	this.bpay=bpay;
	
}
void checkBasicPay()
{
	if(this.bpay>=0&&this.bpay<=500)
	{
		System.out.println("Invalid Basic Pay Amount Check It");
	}
	else
	{
		System.out.println("Your Basic Pay is : "+bpay+" ¤");
	}
}
}
