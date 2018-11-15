package com.sh.guaji.common;

public class TaskData {
	private long taskId;
	private String roomId;
	private String userNum;
	private String gustNum;
	private String startTime;
	private String endTime;
	private String state;
	private long threadId;

	public long getTaskId() {
		return taskId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getGustNum() {
		return gustNum;
	}

	public void setGustNum(String gustNum) {
		this.gustNum = gustNum;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public long getThreadId() {
		return threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}
	
	
}
