package com.srm.swings;

import javax.swing.*;

public class JComboTab {

	public static void main(String[] args) {
		JFrame jf = new JFrame("ComboBox Demo");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JTabbedPane jt = new JTabbedPane();
		jt.setBounds(50, 100, 800, 200);
		jt.add("File", p1);
		jt.add("Edit", p2);
		jt.add("Format",p3);
		jt.add("View", p4);
		jt.add("Help", p5);
		String[] sub = { "Artificial Intelligence", "Machine Learning", "Block Chain", "Cyber Security",
				"Internet of Things" };
		JComboBox jcb = new JComboBox(sub);
		jcb.setBounds(50, 50, 180, 20);
		jf.add(jcb);
		jf.add(jt);
		jf.setLayout(null);
		jf.setSize(400, 500);
		jf.setVisible(true);

	}

}
