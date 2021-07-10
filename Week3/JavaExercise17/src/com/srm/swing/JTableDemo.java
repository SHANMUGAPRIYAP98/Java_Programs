package com.srm.swing;
import javax.swing.*;
public class JTableDemo {
	public static void main(String[] args) {
	JFrame jf=new JFrame("JTABLE DEMO");
	String[][] arr= {{"A2901","Harshith","HR"},{"A2902","Diyashri","Finance"},{"A2903","Parthiban","AES"},{"A2904","Sandhya","PES"},{"A2905","Rani","CCX"}};
	String col[]={"Employee Id","Employee Name","Department"};
	JTable jt=new JTable(arr,col);
	//reason
	JScrollPane js=new JScrollPane(jt);
    jt.setBounds(30,40,200,300);          
    jf.add(js);          
    jf.setSize(500,400);    
    jf.setVisible(true);    

	}

}
