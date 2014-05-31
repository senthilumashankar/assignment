package com.twitteraccount.utils;

import java.util.List;

import com.twitteraccount.user.TwitterUser;
import com.twitteraccount.usercollection.TwitterConsoleUserCollection;

public class TwitterAssignmentHelper {
	
	public static String MINUTE = " minute";
	public static String MINUTES = " minutes";
	
	public static TwitterUser getTwitterUser(TwitterConsoleUserCollection userCollection , String userName){
		return userCollection.get(userName);
	}
	
	public static String getCombinedString(List<String> strList, int starter){
		StringBuilder strBuilder = new StringBuilder();
		for(int i=starter;i<strList.size();i++){
			strBuilder.append(strList.get(i));
			strBuilder.append(" ");
		}
		return strBuilder.toString();
	}

	public static String getMinutes(long milliseconds){
		int millisecondval = (int) ((milliseconds / (1000*60)) % 60);
		if(millisecondval > 1 ){
			return millisecondval + MINUTES;
		}else{
			return millisecondval + MINUTE;
		}
	}
	
	
}
