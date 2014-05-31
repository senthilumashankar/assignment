package com.twitteraccount.command;

import com.twitteraccount.app.TwitterApp;


public class ReadMessage implements UserCommand{
	
	private TwitterApp app;
	
	public ReadMessage(TwitterApp app){
		this.app = app;
	}

	@Override
	public void execute() {
		app.printMessage();
	}

}
