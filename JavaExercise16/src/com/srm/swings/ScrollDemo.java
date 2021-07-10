package com.srm.swings;

import java.awt.FlowLayout;

import javax.swing.*;

public class ScrollDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JTextArea tArea = new JTextArea(10,10);
		JScrollPane scrollPane = new JScrollPane(tArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane);
		jf.setContentPane(panel);
		jf.setSize(500, 500);
		jf.setLocationByPlatform(true);
		jf.setVisible(true);

	}

}
