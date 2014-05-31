package com.twitteraccount.usercollection;

import java.util.HashMap;

import com.twitteraccount.user.TwitterUser;

public class TwitterConsoleUserCollection {

	private HashMap<String, TwitterUser> userMap ;
	
	public TwitterConsoleUserCollection(){
		this.userMap = new HashMap<String, TwitterUser>();
	}

	public HashMap<String, TwitterUser> getUserMap() {
		return userMap;
	}

	public void setUserMap(HashMap<String, TwitterUser> userMap) {
		this.userMap = userMap;
	}
	
	public void addtoUserMap(String userName, TwitterUser usr) {
		this.userMap.put(userName, usr);
	}
	
	public TwitterUser get(String userName) {
		return this.userMap.get(userName);
	}

}
