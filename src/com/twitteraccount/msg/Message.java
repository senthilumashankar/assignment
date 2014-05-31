package com.twitteraccount.msg;

import java.util.Calendar;

import com.twitteraccount.utils.TwitterAssignmentHelper;

public class Message {

	private String msg;

	private Calendar msgEnteredTime;

	public Message(String msg) {
		this.msg = msg;
		this.msgEnteredTime = Calendar.getInstance();
	}
	
	public Message(String msg, Calendar msgEnteredTime) {
		this.msg = msg;
		this.msgEnteredTime = msgEnteredTime;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Calendar getMsgEnteredTime() {
		return msgEnteredTime;
	}

	public void setMsgEnteredTime(Calendar msgEnteredTime) {
		this.msgEnteredTime = msgEnteredTime;
	}

	
	public String toString(){
		return msg.toString() + " " + " ( " + ( TwitterAssignmentHelper.getMinutes(System.currentTimeMillis() - msgEnteredTime.getTimeInMillis()) ) + " ago ) ";
	}

}
