package com.sh.guaji.center;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.ScrollPaneLayout;

import org.apache.log4j.Logger;

import com.sh.guaji.YYJFrame;
import com.sh.guaji.common.TaskData;

public class PanelMain extends JPanel {
	private static Logger logger = Logger.getLogger(PanelMain.class);

	private static final long serialVersionUID = 324129574466728408L;
	private int width = 600;
	private int height = 500;
	private JScrollPane scrollPane;

	public PanelMain() {
		this.setSize(width, height);
		this.setLayout(new BorderLayout(0, 0));
	    scrollPane = new JScrollPane();
	    scrollPane.setLayout(new ScrollPaneLayout());
//	    scrollPane.setBackground(Color.yellow);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//		this.add(scrollPane);
	}

	public void init(){
		
        // 表头（列名）
        Object[] columnNames = {"序号","频道号", "上号数量", "游客数量", "上号时间", "结束时间", "状态"};
        // 表格所有行数据
//        while(){}
        Object[][] rowData = new Object[YYJFrame.taskList.size()][7];
        for(int i=0 ;i < YYJFrame.taskList.size(); i++){
        	TaskData taskData = YYJFrame.taskList.get(i);
        	rowData[i][0] = taskData.getTaskId();
        	rowData[i][1] = taskData.getRoomId();
        	rowData[i][2] = taskData.getUserNum();
        	rowData[i][3] = taskData.getGustNum();
        	rowData[i][4] = taskData.getStartTime();
        	rowData[i][5] = taskData.getEndTime();
        	rowData[i][6] = taskData.getState();
        }
        // 创建一个表格，指定 所有行数据 和 表头
        JTable table = new JTable(rowData, columnNames);

        // 把 表头 添加到容器顶部（使用普通的中间容器添加表格时，表头 和 内容 需要分开添加）
        scrollPane.getViewport().add(table);
		this.add(scrollPane);
	}
	
}
