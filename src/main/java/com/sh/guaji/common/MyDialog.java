package com.sh.guaji.common;

import java.awt.Container;
import java.awt.Label;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class MyDialog extends JDialog {
//	private String message;
	public MyDialog(JFrame frame){
		super(frame, "发生错误" , true);
	}
	
	public void Show(String message){
		Container container = this.getContentPane();
		container.add(new Label(message));
		setBounds(600, 400, 300, 150);
		this.setVisible(true);
	}
	
	

}
