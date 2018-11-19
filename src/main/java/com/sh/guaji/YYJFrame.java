package com.sh.guaji;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sh.guaji.center.PanelMain;
import com.sh.guaji.common.Account;
import com.sh.guaji.common.TaskData;
import com.sh.guaji.left.PanelLeft;

public class YYJFrame extends JFrame {	
	private static final long serialVersionUID = 8413444849866401016L;
	private static Logger logger = LoggerFactory.getLogger(YYJFrame.class);
	
	public static ArrayList<Account> accountList = new ArrayList<Account>();
	public static ArrayList<Account> logedList = new ArrayList<Account>();
	public static ArrayList<Account> activedList = new ArrayList<Account>();
	public static ArrayList<TaskData> taskList = new ArrayList<TaskData>();

	private JPanel contentPane;
	private PanelMain panel_main;
	private PanelLeft panel_left;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YYJFrame frame = new YYJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public YYJFrame() {
		logger.info("YYJFrame start");
		
//		loadData();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);
		
		panel_main = new PanelMain();
		panel_main.init();
		
		panel_left = new PanelLeft();
//		panel_left.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(panel_left, BorderLayout.WEST);
		contentPane.add(panel_main, BorderLayout.CENTER);
	}

	
	public PanelMain getPanel_main() {
		return panel_main;
	}

	public void setPanel_main(PanelMain panel_main) {
		this.panel_main = panel_main;
	}

	public PanelLeft getPanel_left() {
		return panel_left;
	}

	public void setPanel_left(PanelLeft panel_left) {
		this.panel_left = panel_left;
	}

	// 加载数据
	private void loadData(){
		TaskData taskData = new TaskData();
		int t = (int) (100*Math.random()*1000);
		taskData.setRoomId(String.valueOf(t));
		taskData.setUserNum("500");
		taskData.setGustNum("5000");
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		taskData.setStartTime(sf.format(new Date()));
		taskData.setEndTime(sf.format(new Date()));
		
		taskData.setState("active");
		taskList.add(taskData);
		
	}
}
