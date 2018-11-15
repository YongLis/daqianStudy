package com.sh.guaji.common;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TitleBorderPanel extends JPanel {
	
	public TitleBorderPanel(String title){
		super();
		Border lineBorder = BorderFactory.createLineBorder(Color.gray);
		Border borderLeft = BorderFactory.createTitledBorder(lineBorder, title);
		this.setBorder(borderLeft);
	}

}
