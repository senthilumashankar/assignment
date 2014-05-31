package com.twitteraccount.command;

import com.twitteraccount.app.TwitterApp;
import com.twitteraccount.msg.Message;

public class PostMessage implements UserCommand{
	
	private Message msg;
	private TwitterApp app;
	
    public PostMessage(String msgstring, TwitterApp app){
		this.msg = new Message(msgstring);
		this.app = app;
	}
    
	@Override
	public void execute() {
		this.app.postMessage(msg);
	}

}
