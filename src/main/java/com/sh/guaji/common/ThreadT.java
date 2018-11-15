package com.sh.guaji.common;

import java.util.List;

public class ThreadT extends Thread{
	private List<Account> list;
	public ThreadT(List<Account> list){
		this.list = list;
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(list.size());
		}
	}
}
