package com.srm.basic;

import java.io.Serializable;

public class BankOper implements Serializable {
 transient final int CUSTOMER_ID=1;
 
@Override
public String toString() {
	return "BankOper [customerName=" + customerName + ", accountNumber=" + accountNumber + ", phoneNumber="
			+ phoneNumber + "]";
}
String customerName;
 Long accountNumber;
 Long phoneNumber;
 public BankOper(String customerName,Long accountNumber,Long phoneNumber) {
	 this.customerName=customerName;
	 this.accountNumber=accountNumber;
	 this.phoneNumber=phoneNumber;
 }
}
