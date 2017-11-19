package com.vrb.txtedit;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class helper {
	public static void main(String args[]) {
		Txtedit to = new Txtedit();
	}
}

class AboutDialog extends Dialog implements ActionListener {
	AboutDialog(Frame parent, String title) {
		super(parent, title, false);
		this.setResizable(false);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(500, 300);
	}

	public void actionPerformed(ActionEvent ae) {
		dispose();
	}
}