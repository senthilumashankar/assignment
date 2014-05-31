package com.twitteraccount.user;

import java.util.ArrayList;

import com.twitteraccount.msg.Message;

public class TwitterUser {

	private ArrayList<Message> msgList = new ArrayList<Message>();

	private String userName;
	
	private ArrayList<String> follower = new ArrayList<String>();

	public TwitterUser(String userName, Message msg) {
		this.userName = userName;
		this.msgList.add(msg);
	}
	
	public TwitterUser(String userName) {
		this.userName = userName;
	}

	public ArrayList<Message> getMsgList() {
		return msgList;
	}

	public void setMsgList(ArrayList<Message> msgList) {
		this.msgList = msgList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public ArrayList<String> getFollower() {
		return follower;
	}

	public void setFollower(ArrayList<String> follower) {
		this.follower = follower;
	}
	
	@Override
	public int hashCode(){
		return userName.hashCode();
	}
	
	@Override
	public boolean equals(Object object){
		if(null == object || !(object instanceof TwitterUser)){
			return false;
		}
		else {
			return ((TwitterUser)(object)).getUserName().equalsIgnoreCase(userName);
		}
	}
}
