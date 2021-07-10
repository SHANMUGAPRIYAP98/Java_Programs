package com.srm.events;

import java.awt.event.WindowListener;
import java.awt.*;
import java.awt.event.*;

public class ScrollBar extends Frame implements WindowListener, AdjustmentListener {
	Checkbox chkGrayScale;
	Panel MidPanel;
	Scrollbar RedBar;
	Scrollbar BlueBar;
	Scrollbar GreenBar;

	public ScrollBar(String FrameTitle) {

		super(FrameTitle);
		setSize(500, 250);
		setLocation(100, 100);
		addWindowListener(this);
		Panel TopPanel = new Panel();
		MidPanel = new Panel();
		RedBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
		RedBar.setBackground(Color.RED);
		BlueBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
		BlueBar.setBackground(Color.BLUE);
		GreenBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
		GreenBar.setBackground(Color.GREEN);
		RedBar.setBlockIncrement(5);
		BlueBar.setBlockIncrement(5);
		GreenBar.setBlockIncrement(5);
		TopPanel.setLayout(new GridLayout(3, 1));
		TopPanel.add(RedBar);
		TopPanel.add(BlueBar);
		TopPanel.add(GreenBar);

		chkGrayScale = new Checkbox("Gray Scale");
		add(BorderLayout.SOUTH, chkGrayScale);
		add(BorderLayout.NORTH, TopPanel);
		add(MidPanel);

		RedBar.addAdjustmentListener(this);
		BlueBar.addAdjustmentListener(this);
		GreenBar.addAdjustmentListener(this);
	}

	private void setGrayScale(int GrayScaleValue) {
		GreenBar.setValue(GrayScaleValue);
		RedBar.setValue(GrayScaleValue);
		BlueBar.setValue(GrayScaleValue);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		this.dispose();
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		int red, blue, green;
		red = green = blue = 0;
		if (chkGrayScale.getState() != true) {
			red = RedBar.getValue();
			blue = BlueBar.getValue();
			green = GreenBar.getValue();
		} else {
			if (e.getAdjustable() == RedBar) {
				red = blue = green = RedBar.getValue();
				setGrayScale(red);
			}
			if (e.getAdjustable() == BlueBar) {
				blue = green = red = BlueBar.getValue();
				setGrayScale(blue);
			}
			if (e.getAdjustable() == GreenBar) {
				green = red = blue = GreenBar.getValue();
				setGrayScale(green);
			}
		}
		Color rgbColor = new Color(red, green, blue);
		MidPanel.setBackground(rgbColor);
	}

	public static void main(String[] args) {
		ScrollBar fw = new ScrollBar("JSplitPane Example");
		fw.setVisible(true);
	}
}