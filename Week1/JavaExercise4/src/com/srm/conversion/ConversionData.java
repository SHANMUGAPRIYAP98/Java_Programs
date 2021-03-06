package com.srm.conversion;
import java.util.Scanner;
import com.srm.currency.CurrencyConverter;
import com.srm.distance.DistanceConverter;
import com.srm.time.TimeConverter;
public class ConversionData {
	public static void main(String[] args) {
	CurrencyConverter cc=new CurrencyConverter();
	TimeConverter tc=new TimeConverter();
	DistanceConverter dc=new DistanceConverter();
	Scanner sc=new Scanner(System.in);
	int i=0;
	while(i<3) {
	System.out.println("\nConversion Operation"+"\n1.Forex Conversion"+"\n2.Time Conversion"+"\n3.Distance Conversion");
	int op=sc.nextInt();
	if(op==1)
	{
		System.out.println("Enter the Dollar $ : ");
		double dollar=sc.nextDouble();
		double res1=cc.dollarToINR(dollar);
		System.out.println("Dollar To INR : "+res1+" ₹");
		System.out.println("Enter the EURO  : ");
		double euro=sc.nextDouble();
		double res2=cc.euroToINR(euro);
		System.out.println("EURO To INR : "+res2+" ₹");
		System.out.println("Enter the Yen ¥ : ");
		double yen=sc.nextDouble();
		double res3=cc.yenToINR(yen);
		System.out.println("YEN To INR : "+res3+" ₹");
		System.out.println("Enter the Rupees : ");
		double rupee=sc.nextDouble();
		System.out.println("INR To DOLLAR : "+cc.rupeeToDollar(rupee)+" $");
		System.out.println("INR To EURO : "+cc.rupeeToDollar(rupee)+"€");
		System.out.println("INR To YEN : "+cc.rupeeToYen(rupee)+" ¥");
	}
	else if(op==2)
	{
		System.out.println("Enter the Hour  : ");
		double hour=sc.nextDouble();
		double res1=tc.hourToMin(hour);
		System.out.println("Hour to Min  : "+res1+" minutes");
		double res2=tc.hourToSec(hour);
		System.out.println("Hour to Sec : "+res2+" seconds");
		System.out.println("Enter the Minutes : ");
		double min=sc.nextDouble();
		double res3=tc.minToHour(min);
		System.out.println("Hour to Min : "+res3+" hours");
		System.out.println("Enter the Seconds : ");
		double sec=sc.nextDouble();
		double res4=tc.secToHour(sec);
		System.out.println("Hour to Seconds : "+res4+" hours");
	}
	else if(op==3)
	{
		System.out.println("Enter the Kilometre : ");
		double km=sc.nextDouble();
		double res1=dc.kmToMetre(km);
		System.out.println("KM To M : "+res1+" m");
		double res2=dc.kmToMiles(km);
		System.out.println("KM To Miles : "+res2+" miles");
		System.out.println("Enter the Metre : ");
		double m=sc.nextDouble();
		double res3=dc.metreToKm(m);
		System.out.println("M To KM : "+res3+" km");
		System.out.println("Enter the Miles : ");
		double miles=sc.nextDouble();
		double res4=dc.milesToKm(miles);
		System.out.println("Miles to KM : "+res4+" km");
	}
	i++;
	}
	}

}
