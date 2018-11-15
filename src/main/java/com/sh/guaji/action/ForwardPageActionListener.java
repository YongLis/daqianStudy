package com.sh.guaji.action;

import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForwardPageActionListener implements ActionListener {
	private Panel panel;
	private String pageName;
	
	public ForwardPageActionListener(Panel panel, String pageName){
		this.panel = panel;
		this.pageName = pageName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cardLayout = (CardLayout) panel.getLayout();
		cardLayout.show(panel, pageName);
	}

}
