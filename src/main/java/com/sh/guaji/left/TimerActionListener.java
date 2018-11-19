package com.sh.guaji.left;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sh.guaji.YYJFrame;

public class TimerActionListener implements ActionListener {
	private static Logger logger = LoggerFactory.getLogger(Timer.class);
	private String type;
	private JTextField text;
	public TimerActionListener(JTextField text, String type){
		this.type = type;
		this.text = text;
		Timer timer = new Timer(5000, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		logger.info("TimerActionListener fulsh at"+System.currentTimeMillis());
		if ("loginedNum".equals(type)) {
			text.setText(""+YYJFrame.logedList.size());
		}
		if ("unusedNum".equals(type)) {
			text.setText(""+(YYJFrame.logedList.size()-YYJFrame.activedList.size()));
		}
		if ("accountNum".equals(type)) {
			text.setText(""+YYJFrame.accountList.size());
		}

	}

}
