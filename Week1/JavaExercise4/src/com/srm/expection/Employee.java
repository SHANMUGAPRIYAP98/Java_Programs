package com.srm.expection;

public class Employee {
	int eno;
	String ename;
	double basicpay;
	Employee(int e,String nm,double bp)
	{
		this.eno=e;
		this.ename=nm;
		this.basicpay=bp;
	}
	void checkBPay(double basicpay) throws BasicPayExec
	{

       new BasicPayExec(basicpay).checkBasicPay();	
	}
}
