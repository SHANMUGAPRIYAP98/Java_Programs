package com.srm.swings;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("File");
		JMenu jm2 = new JMenu("Edit");
		JMenu jm3 = new JMenu("Source");
		JMenu jm4 = new JMenu("Refactor");
		JMenu jmi1 = new JMenu("New");
		JMenuItem jmi2 = new JMenuItem("Open File");
		JMenuItem jmi3 = new JMenuItem("Open Projects From File System");
		JMenuItem jmi4 = new JMenuItem("Import");
		JMenuItem jmi5 = new JMenuItem("Export");
		JMenuItem jmi6 = new JMenuItem("Undo Typing");
		JMenuItem jmi7 = new JMenuItem("Redo");
		JMenuItem jmi8 = new JMenuItem("Cut");
		JMenuItem jmi9 = new JMenuItem("Copy");
		JMenuItem jmi10 = new JMenuItem("Paste");
		JMenuItem jmi11 = new JMenuItem("Toggle Comment");
		JMenuItem jmi12 = new JMenuItem("Shift Right");
		JMenuItem jmi13 = new JMenuItem("Shift Left");
		JMenuItem jmi14 = new JMenuItem("Format");
		JMenuItem jmi15 = new JMenuItem("Format Element");
		JMenuItem jmi16 = new JMenuItem("Rename");
		JMenuItem jmi17 = new JMenuItem("Move");
		JMenuItem jmi18 = new JMenuItem("Pull Up");
		JMenuItem jmi19 = new JMenuItem("Push Down");
		JMenuItem jmi20 = new JMenuItem("History");
		JMenuItem jmi21 = new JMenuItem("Project");
		JMenuItem jmi22 = new JMenuItem("Package");
		JMenuItem jmi23 = new JMenuItem("Class");
		JMenuItem jmi24 = new JMenuItem("Interface");
		JMenuItem jmi25 = new JMenuItem("Enum");
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		jm1.add(jmi4);
		jm1.add(jmi5);
		jmi1.add(jmi21);
		jmi1.add(jmi22);
		jmi1.add(jmi23);
		jmi1.add(jmi24);
		jmi1.add(jmi25);
		jm2.add(jmi6);
		jm2.add(jmi7);
		jm2.add(jmi8);
		jm2.add(jmi9);
		jm2.add(jmi10);
		jm3.add(jmi11);
		jm3.add(jmi12);
		jm3.add(jmi13);
		jm3.add(jmi14);
		jm3.add(jmi15);
		jm4.add(jmi16);
		jm4.add(jmi17);
		jm4.add(jmi18);
		jm4.add(jmi19);
		jm4.add(jmi20);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jf.setJMenuBar(jmb);
		jf.setSize(400, 400);
		jf.setLayout(null);
		jf.setVisible(true);

	}

}
