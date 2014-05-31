package com.twitteraccount.command;

import com.twitteraccount.msg.Message;
import com.twitteraccount.usercollection.TwitterConsoleUserCollection;


public class InvalidCommand implements UserCommand{
	
	String userName;
	Message msg;
	TwitterConsoleUserCollection userCollection;
	
	public InvalidCommand(String userName, TwitterConsoleUserCollection userCollection){
		this.userName = userName;
		this.userCollection = userCollection;
	}

	@Override
	public void execute() {
		System.out.println("You have entered an invalid command");
	}

}
