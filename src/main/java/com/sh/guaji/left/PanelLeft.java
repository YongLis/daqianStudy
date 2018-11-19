package com.sh.guaji.left;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sh.guaji.YYJFrame;
import com.sh.guaji.common.Account;
import com.sh.guaji.common.TitleBorderPanel;

public class PanelLeft extends JPanel {
	private static final long serialVersionUID = 7630716080488771001L;
	private static Logger logger = LoggerFactory.getLogger(PanelLeft.class);

	public PanelLeft() {
		super();
		logger.info("PanelLeft start");

		// this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(300, 600));

		TitleBorderPanel titledBorder = new TitleBorderPanel("代理设置");
		titledBorder.setPreferredSize(new Dimension(300, 60));
		titledBorder.setLayout(new FlowLayout());

		JCheckBox jCheckBox1 = new JCheckBox("Socks5代理");
		JCheckBox jCheckBox2 = new JCheckBox("TCP代理");
		JCheckBox jCheckBox3 = new JCheckBox("HTTPS代理");

		titledBorder.add(jCheckBox1);
		titledBorder.add(jCheckBox2);
		titledBorder.add(jCheckBox3);

		this.add(titledBorder);

		TitleBorderPanel titledBorder2 = new TitleBorderPanel("人气设置");
		titledBorder2.setPreferredSize(new Dimension(300, 250));

		// 设置格式布局
		JPanel panel1 = new JPanel(new GridLayout(6, 2, 5, 5));
		panel1.add(new JLabel("频道号"));
		JTextField jTextField_room = new JTextField(10);
		panel1.add(jTextField_room);

		panel1.add(new JLabel("原频道号"));
		JTextField jTextField_oldRoom = new JTextField(10);
		panel1.add(jTextField_oldRoom);

		panel1.add(new JLabel("数量"));
		JTextField jTextField_num = new JTextField(10);
		panel1.add(jTextField_num);

		panel1.add(new JLabel("启用游客"));
		JTextField jTextField_gust = new JTextField(10);
		panel1.add(jTextField_gust);

		//
		JButton jButton_sh = new JButton("进入频道");
		jButton_sh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 点击设置后，获取频道号，数量，及启用的游客数量，进入指定频道

			}
		});

		JButton jButton_qh = new JButton("切换频道");
		jButton_sh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 点击切换后，获取频道号，数量，及启用的游客数量，原频道账号及游客数量切换到新频道

			}
		});

		JButton jButton_exit = new JButton("退出频道");
		jButton_sh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 点击切换后，获取频道号，数量，及启用的游客数量，原频道账号及游客数量切换到新频道

			}
		});

		JButton jButton_login = new JButton("账号登录");
		jButton_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 点击切换后，获取频道号，数量，及启用的游客数量，原频道账号及游客数量切换到新频道

			}
		});

		panel1.add(jButton_sh);
		panel1.add(jButton_qh);
		panel1.add(jButton_exit);
		panel1.add(jButton_login);

		titledBorder2.add(panel1);
		this.add(titledBorder2);

		TitleBorderPanel titledBorder3 = new TitleBorderPanel("账号设置");
		titledBorder3.setPreferredSize(new Dimension(300, 60));

		JPanel panel2 = new JPanel(new GridLayout(1, 1, 5, 5));
		JButton loadFile_button = new JButton("导入账号");

		loadFile_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();

				int retVal = chooser.showOpenDialog(null);

				File file = chooser.getSelectedFile();
				readFile(file);

			}
		});

		panel2.add(loadFile_button);
		titledBorder3.add(panel2);
		this.add(titledBorder3);

		// 统计
		TitleBorderPanel titledBorder4 = new TitleBorderPanel("统计");
		titledBorder4.setPreferredSize(new Dimension(300, 120));

		JPanel panel4 = new JPanel(new GridLayout(5, 2, 2, 2));
		// 总账号数量
		panel4.add(new JLabel("总账号数量："));
		JTextField text_acctountNum = new JTextField(
				YYJFrame.accountList.size() + "");
		text_acctountNum.setEditable(false);
		text_acctountNum.addActionListener(new TimerActionListener(
				text_acctountNum, "acctountNum"));
		panel4.add(text_acctountNum, "text_acctountNum");

		// 已登录账号数量
		panel4.add(new JLabel("已登录数量："));
		JTextField text_loginedNum = new JTextField(YYJFrame.logedList.size()
				+ "");
		text_loginedNum.setEditable(false);
		text_loginedNum.addActionListener(new TimerActionListener(
				text_loginedNum, "loginedNum"));
		panel4.add(text_loginedNum, "text_loginedNum");

		// 已登录未使用剩余数量
		panel4.add(new JLabel("未进频道数量："));
		JTextField text_unusedNum = new JTextField(
				(YYJFrame.logedList.size() - YYJFrame.activedList.size()) + "");
		text_unusedNum.setEditable(false);
		text_unusedNum.addActionListener(new TimerActionListener(
				text_unusedNum, "unusedNum"));
		panel4.add(text_unusedNum, "jLabel4_unusedNum");
		titledBorder4.add(panel4, "tj");
		this.add(titledBorder4, "titledBorder4");
	}

	// 读取文件
	private void readFile(File file) {
		if (file != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(file));
				String line = null;
				while ((line = reader.readLine()) != null) {
					String[] tmp = line.split("\\|");
					Account account = new Account();
					account.setName(tmp[0]);
					account.setPassword(tmp[1]);
					account.setState("0");
					YYJFrame.accountList.add(account);
					line = null;
				}
			} catch (Exception e) {
				logger.error("读文件错误", e);
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
