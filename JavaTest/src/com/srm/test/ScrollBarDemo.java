package com.srm.test;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;

interface Names
{
	String concat(String name);
}
class ScrollEvent 
{
	ScrollEvent()
	{
		   Names n1=(name)->
		   {
			   return "Welcome "+ name;
		   };
		   Frame f= new Frame("Scrollbar Example");  
           final Label label = new Label();          
           label.setAlignment(Label.CENTER);  
           label.setSize(400,100);  
           final Scrollbar s=new Scrollbar();  
           s.setBounds(100,100, 50,100);  
           f.add(s);f.add(label);   
           f.setSize(400,400);  
           f.setLayout(null);  
           f.setVisible(true);  
           s.addAdjustmentListener(new AdjustmentListener() {  
               public void adjustmentValueChanged(AdjustmentEvent e) {  
                  label.setText(n1.concat("diyashri"));  
               }  
           });  
	}
	
	
}


public class ScrollBarDemo {

	public static void main(String[] args) {
		new ScrollEvent();

	}

}
