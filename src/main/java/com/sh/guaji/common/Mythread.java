package com.sh.guaji.common;

import com.sh.guaji.YYJFrame;
import com.sh.guaji.left.PanelLeft;

public class Mythread extends Thread {
	private PanelLeft panelLeft;

	public Mythread(PanelLeft panelLeft) {
		this.panelLeft = panelLeft;
	}

	@Override
	public void start() {
		while (true) {
			try {
				sleep(2000);
				
				TitleBorderPanel titleBorderPanel = panelLeft.getco
				
//				panelLeft.jLabel4_accountNum.setText(YYJFrame.accountList.size()+"");
//				panelLeft.jLabel4_loginedNum.setText(YYJFrame.logedList.size()+"");
//				panelLeft.jLabel4_unusedNum.setText((YYJFrame.logedList.size()-YYJFrame.activedList.size())+"");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
