package com.srm.swing;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		DefaultMutableTreeNode top1 = new DefaultMutableTreeNode("OOPS");
		DefaultMutableTreeNode top2 = new DefaultMutableTreeNode("Java Strings");
		DefaultMutableTreeNode df1 = new DefaultMutableTreeNode("Abstraction");
		DefaultMutableTreeNode df2 = new DefaultMutableTreeNode("Encapsulation");
		DefaultMutableTreeNode df3 = new DefaultMutableTreeNode("Inheritance");
		DefaultMutableTreeNode df4 = new DefaultMutableTreeNode("Polymorphism");
		DefaultMutableTreeNode top3 = new DefaultMutableTreeNode("Mutable");
		DefaultMutableTreeNode top4 = new DefaultMutableTreeNode("Immutable");
		DefaultMutableTreeNode df7 = new DefaultMutableTreeNode("String Buffer");
		DefaultMutableTreeNode df8 = new DefaultMutableTreeNode("String Builder");
		DefaultMutableTreeNode df9 = new DefaultMutableTreeNode("Strings");
		top1.add(df1);
		top1.add(df2);
		top1.add(df3);
		top1.add(df4);
		top3.add(df7);
		top3.add(df8);
		top4.add(df9);
		top2.add(top3);
		top2.add(top4);
		top1.add(top2);
		JTree jt = new JTree(top1);
		jf.add(jt);
		jf.setSize(400, 400);
		jf.setVisible(true);

	}

}
