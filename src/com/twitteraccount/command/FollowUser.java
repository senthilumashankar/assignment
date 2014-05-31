package com.twitteraccount.command;

import com.twitteraccount.app.TwitterApp;

public class FollowUser implements UserCommand{
	
	private String followusr;
	private TwitterApp app;
	
	 public FollowUser(String followusr, TwitterApp app){
			this.followusr = followusr;
			this.app = app;
		}

	@Override
	public void execute() {
		this.app.followOther(followusr);
		
	}

}
