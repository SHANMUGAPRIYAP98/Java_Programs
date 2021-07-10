package com.srm.awt;

import java.awt.Frame;
import java.awt.*;
public class FrameDemo extends Frame {

	public static void main(String[] args) {
		Frame f=new Frame();
		Button b=new Button("My Custom Button");  
		b.setBounds(30,100,150,30); 
		f.add(b); 
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);

	}

}
