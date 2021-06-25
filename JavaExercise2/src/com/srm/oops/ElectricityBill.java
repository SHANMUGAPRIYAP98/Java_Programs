package com.srm.oops;

import java.util.Scanner;

class Electricity
{
	int consumerNo;
	String consumerName;
	float previousMonth;
	float currentMonth;
	float units;
	float cost;
	float totalCost;
	String EBType;
	
    public Electricity(int consumerNo, String consumerName, float previousMonth, float currentMonth,
			String eBType) {
		super();
		this.consumerNo = consumerNo;
		this.consumerName = consumerName;
		this.previousMonth = previousMonth;
		this.currentMonth = currentMonth;
		EBType = eBType;
	}

	double tariffCalc(String EBType)
    {	
    	if(EBType.toLowerCase()=="domestic")
    	{
    		this.units=this.currentMonth;
    		System.out.println(this.units);
    		if(this.units>501)
    		{
    			cost=this.units*6;
    		}
    		else if(this.units>=201&&this.units<=500)
    		{
    			cost=this.units*4;
    		}
    		else if(this.units>=101&&this.units<=200)
    		{
    			cost=this.units*2.5f;
    		}
    		else
    		{
    			cost=1;
    		}
    	}
    	else
    	{
    		if(this.units>501)
    		{
    			cost=this.units*7;
    			
    		}
    		else if(this.units>=201&&this.units<=500)
    		{
    			cost=this.units*6;
    			
    		}
    		else if(this.units>=101&&this.units<=200)
    		{
    			cost=this.units*4.5f;
    			
    		}
    		else
    		{
    			cost=2;
    			
    		}
    	}
    	return cost;
    }
   
    void displayData() {
    	System.out.println("----------------------------ELECTRICITY BILL------------------------------");
    	System.out.println("Consumer No"+this.consumerNo);
    	System.out.println("Consumer Name"+this.consumerName);
    	System.out.println("EB Type : "+this.EBType);
    	System.out.println("Previous Unit : "+this.previousMonth);
    	System.out.println("Current Unit : "+this.currentMonth);
    	System.out.println("Total Cost : "+this.cost);
    }
	
}
public class ElectricityBill {

	public static void main(String[] args) {
		System.out.println("Enter the Consumer No : ");
		Scanner sc=new Scanner(System.in);
		int cno=sc.nextInt();
		System.out.println("Enter the Consumer Name : ");
		String cname=sc.next();
		System.out.println("Enter the Previous Units  : ");
		float punits=sc.nextFloat();
		System.out.println("Enter the Current Units  : ");
		float cunits=sc.nextFloat();
		System.out.println("Enter the EB Type [ DOMESTIC,COMMERCIAL] : ");
		String eb=sc.next();
		Electricity elec=new Electricity(cno, cname, punits, cunits, eb);
		elec.tariffCalc(eb);
		elec.displayData();

	}

}
